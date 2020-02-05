package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("==== Show all Items ====");
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
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("==== Update Item ====");
        String id = input.askStr("Enter id to replace item: ");
        String name = input.askStr("Enter a new name: ");
        Item item = new Item(name);
        String msg = (tracker.replace(id, item)) ? "The item with this ID has been updated." : "Item with this id not found.";
        System.out.println(msg);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete Item ====");
        String id = input.askStr("Enter id to delete item: ");
        String msg = (tracker.delete(id)) ? "Item with this id deleted." : "Item with this id not found.";
        System.out.println(msg);
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find Item by Id ====");
        String id = input.askStr("Enter id to search from item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Found item with id: " + item.getId());
            System.out.println("Name: " + item.getName());
        } else {
            System.out.println("Item with this id not found.");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("==== Find Items by name ====");
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
    }


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(System.lineSeparator() + "Menu." + System.lineSeparator());
        System.out.println("0. Add new item");
        System.out.println("1. Show all item");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}