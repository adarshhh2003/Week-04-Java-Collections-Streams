package com.warehousemanagementsystem;
// Main class
public class SmartWarehouseSystem {
    // Main method
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        groceriesStorage.addItem(new Groceries("Milk"));
        groceriesStorage.addItem(new Groceries("Oil"));

        furnitureStorage.addItem(new Furniture("Bed"));
        furnitureStorage.addItem(new Furniture("Table"));

        WarehouseUtils.displayItems(electronicsStorage.getItems());
        System.out.println();

        WarehouseUtils.displayItems(groceriesStorage.getItems());
        System.out.println();

        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
