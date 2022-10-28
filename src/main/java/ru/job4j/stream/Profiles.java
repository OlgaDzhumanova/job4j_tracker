package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return (List<Address>) profiles.stream()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return (List<Address>) profiles.stream()
                .sorted(Comparator.comparing(profile -> profile.getAddress().getCity()))
                .map(profile -> profile.getAddress())
                .distinct()
                .collect(Collectors.toList());
    }
}
