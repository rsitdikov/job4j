package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class MemTracker implements Store {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();

    @Override
    public void init() {

    }

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    @Override
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    @Override
    public List<Item> findAll() {
        return items;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    @Override
    public Item findById(String id) {
        int index = indexOf(id);
        return index == -1 ? null : items.get(index);
        }

    private int indexOf(String id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    @Override
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(items.get(index).getId());
            items.set(index, item);
            rsl = true;
        }
        return rsl;
    }

    @Override
    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index >= 0) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }

    @Override
    public void close() {

    }
}