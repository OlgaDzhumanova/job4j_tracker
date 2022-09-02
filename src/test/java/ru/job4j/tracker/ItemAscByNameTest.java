package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {
    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Table", 3),
                new Item("Chair", 1),
                new Item("Armchair", 4),
                new Item("Sofa", 2)
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Armchair", 4),
                new Item("Chair", 1),
                new Item("Sofa", 2),
                new Item("Table", 3)
        );
        assertThat(items, is(expected));
    }
}