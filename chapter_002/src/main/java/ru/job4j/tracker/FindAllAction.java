package ru.job4j.tracker;

public class FindAllAction implements UserAction  {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            System.out.println(items.length + " item(s) found.");
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
