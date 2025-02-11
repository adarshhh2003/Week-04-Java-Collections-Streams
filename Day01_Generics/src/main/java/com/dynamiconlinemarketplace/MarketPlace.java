package com.dynamiconlinemarketplace;

public class MarketPlace {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Book book = new Book("Java Programming", 150.0, BookCategory.EDUCATIONAL);
        Clothing shirt = new Clothing("Casual Shirt", 350.0, ClothingCategory.MEN);
        Gadget phone = new Gadget("Smart Phone", 500.0, GadgetCategory.ACCESSORY);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount");
        catalog.showCatalog();

        // Apply Discount
        DiscountManager.applyDiscount(book, 5);
        DiscountManager.applyDiscount(shirt, 10);
        DiscountManager.applyDiscount(phone, 15);

        System.out.println("\nAfter Discount");
        catalog.showCatalog();
    }
}
