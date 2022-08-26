package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Table", 3),
                new Item("Chair", 1),
                new Item("Armchair", 4),
                new Item("Sofa", 2)
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Armchair", 4),
                new Item("Chair", 1),
                new Item("Sofa", 2),
                new Item("Table", 3)
        );
        assertThat(String.valueOf(items), is(String.valueOf(expected)));
    }
}