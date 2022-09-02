package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftList = left.split(". ");
        String[] rightList = right.split(". ");
        int leftNumber = Integer.parseInt(leftList[0]);
        int rightNumber = Integer.parseInt(rightList[0]);
        return Integer.compare(leftNumber, rightNumber);
    }
}
