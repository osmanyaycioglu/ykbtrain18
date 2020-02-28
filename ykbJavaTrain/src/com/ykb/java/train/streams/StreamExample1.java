package com.ykb.java.train.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(final String[] args) {
        List<String> asList = Arrays.asList("osman1",
                                            "osman2",
                                            "mehmet",
                                            "ali",
                                            "asdhaksjdhakj");
        Stream<String> filter = asList.stream()
                                      .filter(g -> g.length() > 3);
        Stream<String> stream = asList.stream();
        Stream<String> ofStream = Stream.of("osman1",
                                            "osman2",
                                            "mehmet",
                                            "ali",
                                            "asdhaksjdhakj");
        Stream<Integer> of = Stream.of(1,
                                       2,
                                       3,
                                       4,
                                       5);
        IntStream of2 = IntStream.of(1,
                                     2,
                                     3,
                                     4,
                                     5);
        LongStream of3 = LongStream.of(1L,
                                       2L,
                                       3L,
                                       4L);
        DoubleStream of4 = DoubleStream.of(1D,
                                           2.2D,
                                           3.3);

        Stream<String> distinct = filter.distinct();
        long f = distinct.count();

        long count = asList.stream()
                           .filter(g -> g.length() > 3)
                           .filter(g -> g.length() < 7)
                           .distinct()
                           .count();
        Optional<String> findAny = asList.stream()
                                         .filter(g -> g.length() > 3)
                                         .filter(g -> g.length() < 7)
                                         .distinct()
                                         .findAny();

        long count1 = asList.stream()
                            .filter(g -> {
                                System.out.println("Filter1 : "
                                                   + g
                                                   + " Thread : "
                                                   + Thread.currentThread()
                                                           .getName());
                                return g.length() > 3;
                            })
                            .filter(g -> {
                                System.out.println("Filter2 : "
                                                   + g
                                                   + " Thread : "
                                                   + Thread.currentThread()
                                                           .getName());

                                return g.length() < 7;
                            })
                            .distinct()
                            .count();

        System.out.println(count1);

    }
}
