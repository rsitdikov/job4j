package ru.job4j.tracker;

import java.util.ArrayList;

public class FindAllAction implements UserAction  {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> items = tracker.findAll();
        if (items.size() > 0) {
            System.out.println(items.size() + " item(s) found.");
            for (Item item:items) {
                System.out.println(System.lineSeparator() + "Name: " + item.getName());
                System.out.println("Id: " + item.getId());
            }
        } else {
            System.out.println("No items found");
        }
        return true;
    }
}
