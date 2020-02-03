package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ====");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    System.out.println(items.length + " item(s) found.");
                    for (Item item:items) {
                        System.out.println("\nName: " + item.getName());
                        System.out.println("Id: " + item.getId());
                    }
                } else {
                    System.out.println("No items found");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.print("Enter id to edit item: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Old name: " + item.getName());
                    System.out.print("Enter a new name: ");
                    String name = scanner.nextLine();
                    Item itm = new Item(name);
                    tracker.replace(id, itm);
                } else {
                    System.out.println("Item with this id not found.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter id to delete item: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    tracker.delete(id);
                } else {
                    System.out.println("Item with this id not found.");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                System.out.print("Enter id to search from item: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Found item with id: " + item.getId());
                    System.out.println("Name:" + item.getName());
                } else {
                    System.out.println("Item with this id not found.");
                }
            } else if (select == 5) {
                System.out.println("=== Find Items by name ====");
                System.out.print("Enter a name to search: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    System.out.println(items.length + " item(s) found with this name.");
                } else {
                    System.out.println("Items with this name not found.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMenu.\n");
        System.out.println("0. Add new item");
        System.out.println("1. Show all item");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}