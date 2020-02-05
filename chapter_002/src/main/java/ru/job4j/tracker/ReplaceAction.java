package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Update Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id to replace item: ");
        String name = input.askStr("Enter a new name: ");
        Item item = new Item(name);
        String msg = (tracker.replace(id, item)) ? "The item with this ID has been updated." : "Item with this id not found.";
        System.out.println(msg);
        return true;
    }
}
