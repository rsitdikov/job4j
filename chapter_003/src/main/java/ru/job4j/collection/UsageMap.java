package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(
                Map.of(
                    "ivanov@mail.ru", "Ivan Ivanov",
                    "petrov@gmail.com", "Petr Petrov",
                    "sidorov@yahoo.com", "Sidor Sidorov"
                )
        );
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}