package com.ykb.java.train.oo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ykb.java.train.puzzles.Employee;

public class SetTry {
    public static void main(final String[] args) {
        // Set<String> strSet = new TreeSet<>();
        Set<String> strSet = new HashSet<>();
        strSet.add("1");
        strSet.add("10");
        strSet.add("11");
        strSet.add("12");
        strSet.add("13");
        strSet.add("1");
        strSet.add("20");
        strSet.add("21");
        strSet.add("22");
        strSet.add("23");
        strSet.add("3");

        Set<Employee> empSet = new HashSet<>();
        empSet.add(new Employee("osman",
                                "yay",
                                50));
        empSet.add(new Employee("osman",
                                "yay",
                                50));

        List<Employee> empList = new ArrayList<>(empSet);
        Collections.sort(empList);
        final int b = 100;
        Collections.sort(empList,
                         new Comparator<Employee>() {

                             @Override
                             public int compare(final Employee o1,
                                                final Employee o2) {
                                 System.out.println(b);
                                 return o1.getSurname()
                                          .compareTo(o2.getSurname());
                             }
                         });

        // Set<String> strSet2 = new TreeSet<>();
        Set<String> strSet2 = new HashSet<>();
        strSet2.add("1");
        strSet2.add("100");
        strSet2.add("110");
        strSet2.add("120");
        strSet2.add("130");
        strSet2.add("5");
        strSet2.add("6");
        strSet2.add("21");
        strSet2.add("22");
        strSet2.add("23");
        strSet2.add("3");

        strSet2.retainAll(strSet);
        // Sort
        ArrayList<String> arrayList = new ArrayList<>(strSet2);
        Collections.sort(arrayList);

        System.out.println(arrayList);

        strSet2.removeAll(strSet);
        System.out.println(strSet2);
        strSet2.addAll(strSet);
        System.out.println(strSet2);

        List<String> asList = Arrays.asList("1",
                                            "2",
                                            "3",
                                            "4");
        Set<String> sSet = new HashSet<>(asList);

    }
}
