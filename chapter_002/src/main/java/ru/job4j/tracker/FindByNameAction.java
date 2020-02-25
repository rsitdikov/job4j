package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find Items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter a name to search: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            System.out.println(items.size() + " item(s) found with the name(s):");
            for (Item item : items) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("Items with this name not found.");
        }
        return true;
    }
}
