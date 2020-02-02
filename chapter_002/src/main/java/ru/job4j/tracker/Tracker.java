package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.position];
        int size = 0;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                rsl[size++] = this.items[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index == -1 ? null : items[index];
        }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(this.items[index].getId());
            this.items[index] = item;
            rsl = true;
        }
        return rsl;
    }
    public boolean delete(String id) {
        boolean rsl = false;
        int dist = indexOf(id);
        if (dist >= 0) {
            int start = dist + 1;
            int size = position - start;
            System.arraycopy(items, start, items, dist, size);
            items[position--] = null;
            rsl = true;
        }
        return rsl;
    }
}