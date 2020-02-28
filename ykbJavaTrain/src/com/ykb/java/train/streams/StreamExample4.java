
package com.ykb.java.train.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

import com.ykb.java.train.puzzles.Customer;

public class StreamExample4 {
    public static void main(final String[] args) throws IOException {
        int commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
        System.out.println(commonPoolParallelism);
        List<Customer> collect = Files.readAllLines(Paths.get("customer.txt"))
                                      .parallelStream()
                                      .map(s -> {
                                          System.out.println("Map Thread : "
                                                             + Thread.currentThread()
                                                                     .getName());
                                          String[] split = s.split(",");
                                          Customer customer = new Customer();
                                          customer.setIsim(split[0]);
                                          customer.setSoyisim(split[1]);
                                          customer.setYas(Integer.parseInt(split[2]));
                                          return customer;
                                      })
                                      .filter(c -> {
                                          System.out.println("Filter Thread : "
                                                             + Thread.currentThread()
                                                                     .getName());
                                          return c.getYas() > 30;
                                      })
                                      .collect(Collectors.toList());
        System.out.println(collect);
    }
}
