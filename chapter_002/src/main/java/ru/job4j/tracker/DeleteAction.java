package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id to delete item: ");
        String msg = (tracker.delete(id)) ? "Item with this id deleted." : "Item with this id not found.";
        System.out.println(msg);
        return true;
    }
}
