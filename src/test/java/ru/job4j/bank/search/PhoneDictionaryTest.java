package ru.job4j.bank.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        Assertions.assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }
}