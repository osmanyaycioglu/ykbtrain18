
package com.ykb.java.train.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ykb.java.train.puzzles.Customer;

public class StreamExample2 {
    public static void main(final String[] args) {
        List<String> asList = Arrays.asList("osman1",
                                            "osman2",
                                            "mehmet",
                                            "ali",
                                            "asdhaksjdhakj");
        OptionalInt max = asList.stream()
                                .mapToInt(s -> s.length())
                                .max();

        int sum = asList.stream()
                        .mapToInt(s -> s.length())
                        .sum();

        AtomicInteger total = new AtomicInteger();
        Stream<String> mste = asList.stream()
                                    .sorted();

        Stream<Integer> afterMap = mste.map(s -> s.length());
        afterMap.forEach(i -> total.addAndGet(i));

        asList.stream()
              .sorted()
              .map(d -> new Customer().setIsim(d))
              .forEach(c -> System.out.println(c.getIsim()));

        Optional<Integer> reduce = asList.stream()
                                         .map(s -> s.length())
                                         .reduce((t,
                                                  e) -> t
                                                        + e);

        Optional<Integer> reduce2 = asList.stream()
                                          .map(s -> s.length())
                                          .reduce((t,
                                                   i) -> t
                                                         + i);
        List<Integer> al = new ArrayList<Integer>();

        List<Integer> collect = asList.stream()
                                      .map(s -> s.length())
                                      .collect(Collectors.toList());

        Double collect2 = asList.stream()
                                .map(s -> s.length())
                                .collect(Collectors.averagingDouble(e -> (double) e));

        Long collect3 = asList.stream()
                              .map(s -> s.length())
                              .collect(Collectors.counting());

        DoubleSummaryStatistics collect4 = asList.stream()
                                                 .map(s -> s.length())
                                                 .collect(Collectors.summarizingDouble(e -> (double) e));

    }
}
