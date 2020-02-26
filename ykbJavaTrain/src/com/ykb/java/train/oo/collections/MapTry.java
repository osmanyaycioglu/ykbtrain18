package com.ykb.java.train.oo.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.ykb.java.train.puzzles.Employee;

public class MapTry {
    public static void main(final String[] args) {
        Map<String, Employee> empMap = new HashMap<>();
        Map<String, Employee> empSortedMap = new TreeMap<>();
        Map<String, Employee> empConMap = new ConcurrentHashMap<>(1_000_000,
                                                                  0.9F,
                                                                  1_000);
        empMap.put("1",
                   new Employee("osman",
                                "yay",
                                50));
        empMap.put("xyz",
                   new Employee("mehmet",
                                "yay",
                                30));

        Employee remove = empMap.remove("1");

        Employee employee = empMap.get("xyz");

        Set<String> keySet = empMap.keySet();
        for (String name : keySet) {
            Employee employee2 = empMap.get(name);
        }

        Collection<Employee> values = empMap.values();
        for (Employee employee2 : values) {
            System.out.println(employee2);
        }

        Set<Entry<String, Employee>> entrySet = empMap.entrySet();
        for (Entry<String, Employee> entry : entrySet) {
            String key = entry.getKey();
            Employee value = entry.getValue();
        }
    }
}
