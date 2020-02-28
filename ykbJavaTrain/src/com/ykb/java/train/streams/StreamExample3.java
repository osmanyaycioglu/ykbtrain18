
package com.ykb.java.train.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ykb.java.train.puzzles.Customer;

public class StreamExample3 {
    public static void main(final String[] args) throws IOException {

        String str = "osman,ali,veli";
        List<String> collect3 = Stream.of(str.split(","))
                                      .flatMap(s -> {
                                          List<String> strList = new ArrayList<>();
                                          char[] charArray = s.toCharArray();
                                          for (int i = 0; i < charArray.length; i++) {
                                              strList.add(""
                                                          + charArray[i]);
                                          }
                                          return strList.stream();
                                      })
                                      .distinct()
                                      .sorted()
                                      .collect(Collectors.toList());
        System.out.println(collect3);

        List<Customer> collect = Files.readAllLines(Paths.get("customer.txt"))
                                      .stream()
                                      .map(s -> {
                                          String[] split = s.split(",");
                                          Customer customer = new Customer();
                                          customer.setIsim(split[0]);
                                          customer.setSoyisim(split[1]);
                                          customer.setYas(Integer.parseInt(split[2]));
                                          return customer;
                                      })
                                      .collect(Collectors.toList());

        Map<String, Set<Customer>> collect2 = collect.stream()
                                                     .collect(Collectors.groupingBy(t -> t.getIsim(),
                                                                                    Collectors.toSet()));
        Map<String, Customer> collect4 = collect.stream()
                                                .collect(() -> new HashMap<String, Customer>(),
                                                         (m,
                                                          e) -> m.put(e.getIsim(),
                                                                      e),
                                                         (m1,
                                                          m2) -> m1.putAll(m2));

//        Map<String, Customer> collect3 = collect.stream()
//                                                .collect(Collectors.toMap(t -> t.getIsim(),
//                                                                          Function.identity()));
//
        int sum3 = collect.stream()
                          .sorted((c1,
                                   c2) -> c2.getYas()
                                          - c1.getYas())
                          .limit(3)
                          .mapToInt(Customer::getYas)
                          .sum();

        int sum = collect.stream()
                         .mapToInt(e -> e.getYas())
                         .sum();

        int sum2 = collect.stream()
                          .skip(2)
                          .limit(3)
                          .mapToInt(Customer::getYas)
                          .sum();

    }
}
