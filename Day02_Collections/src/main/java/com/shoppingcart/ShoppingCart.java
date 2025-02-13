package com.shoppingcart;

import java.util.*;

public class ShoppingCart {
    // HashMap to store product prices
    private Map<String, Double> productPrices = new HashMap<>();

    // LinkedHashMap to maintain order of items added
    private Map<String, Double> cartItems = new LinkedHashMap<>();

    // TreeMap to display items sorted by price
    private Map<String, Double> sortedItems = new TreeMap<>();

    // Add product to the shopping cart
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cartItems.put(product, price);
    }

    // Display cart items in insertion order
    public void displayCartItems() {
        System.out.println("Cart Items (Insertion Order):");
        cartItems.forEach((product, price) -> System.out.println(product + ": $" + price));
    }

    // Display cart items sorted by price
    public void displaySortedItemsByPrice() {
        sortedItems.putAll(cartItems);
        System.out.println("\nCart Items (Sorted by Price):");
        sortedItems.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": $" + entry.getValue()));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct("Laptop", 800.00);
        cart.addProduct("Smartphone", 400.00);
        cart.addProduct("Headphones", 100.00);
        cart.addProduct("Mouse", 25.00);

        // Displaying cart items
        cart.displayCartItems();
        cart.displaySortedItemsByPrice();
    }
}
