package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Ivan");
        assertThat(persons.get(0).getSurname(), is("Sidorov"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Sidorov");
        assertThat(persons.get(0).getName(), is("Ivan"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        ArrayList<Person> persons = phones.find("1234567");
        assertThat(persons.get(0).getSurname(), is("Sidorov"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Moscow");
        assertThat(persons.get(0).getSurname(), is("Sidorov"));
    }
}