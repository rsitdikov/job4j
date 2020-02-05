package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find Item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id to search from item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Found item with id: " + item.getId());
            System.out.println("Name: " + item.getName());
        } else {
            System.out.println("Item with this id not found.");
        }
        return true;
    }
}
