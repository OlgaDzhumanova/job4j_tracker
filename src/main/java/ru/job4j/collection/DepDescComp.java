package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] dep1 = o1.split("/");
        String[] dep2 = o2.split("/");
        int index = Math.min(dep1.length, dep2.length);
        if (dep1[0].equals(dep2[0])) {
            if (dep1.length == dep2.length) {
                for (int i = 1; i < index; i++) {
                    rsl = dep1[i].compareTo(dep2[i]);
                }
            } else if (dep1.length < dep2.length) {
                rsl = o1.compareTo(o2);
            }
        } else {
            rsl = dep2[0].compareTo(dep1[0]);
        }
        return rsl;
    }
}
