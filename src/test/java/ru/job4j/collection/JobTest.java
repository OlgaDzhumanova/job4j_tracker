package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> ascByName = new JobAscByName();
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Teacher", 2)
        );
        assertThat(rsl).isLessThan(1);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> ascByName = new JobAscByName();
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Teacher", 2)
        );
        assertThat(rsl).isLessThan(-1);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> ascByName = new JobAscByName();
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Teacher", 2)
        );
        assertThat(rsl).isLessThan(1);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> ascByName = new JobAscByName();
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Teacher", 2)
        );
        assertThat(rsl).isLessThan(2);
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        Comparator<Job> ascByName = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Banker", 2)
        );
        assertThat(rsl).isLessThan(1);
    }

    @Test
    public void whenComparatorAscByNameAndDescByPriority() {
        Comparator<Job> ascByName = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = ascByName.compare(
                new Job("Banker", 1),
                new Job("Teacher", 2)
        );
        assertThat(rsl).isLessThan(1);
    }
}