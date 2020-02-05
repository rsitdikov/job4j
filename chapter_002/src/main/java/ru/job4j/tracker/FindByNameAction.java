package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find Items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter a name to search: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            System.out.println(items.length + " item(s) found with the name(s):");
            for (Item item : items) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("Items with this name not found.");
        }
        return true;
    }
}
