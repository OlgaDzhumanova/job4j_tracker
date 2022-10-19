package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] dep1 = o1.split("/");
        String[] dep2 = o2.split("/");
        rsl = dep2[0].compareTo(dep1[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}
