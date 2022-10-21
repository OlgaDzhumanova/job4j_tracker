package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filterSize(List<Folder> list) {
         return filter(list, fil -> fil.getSize() > 100);
    }

    public static List<Folder> filterName(List<Folder> list) {
          return   filter(list, fil -> fil.getName().contains("bug"));
    }

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder folder : list) {
            pred.test(folder);
            rsl.add(folder);
        }
        return rsl;
    }
}