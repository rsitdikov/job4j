package ru.job4j.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        var persons = phones.find("Ivan");
        assertEquals(persons.get(0).getSurname(), "Sidorov");
    }

    @Test
    public void whenFindBySurname() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        var persons = phones.find("Sidorov");
        assertEquals(persons.get(0).getName(), "Ivan");
    }

    @Test
    public void whenFindByPhone() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        var persons = phones.find("1234567");
        assertEquals(persons.get(0).getSurname(), "Sidorov");
    }

    @Test
    public void whenFindByAddress() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Sidorov", "1234567", "Moscow")
        );
        var persons = phones.find("Moscow");
        assertEquals(persons.get(0).getSurname(), "Sidorov");
    }
}