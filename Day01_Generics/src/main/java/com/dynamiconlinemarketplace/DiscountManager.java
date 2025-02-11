package com.dynamiconlinemarketplace;

public class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount Applied: " + percentage + "% off on " + product.getName());
    }
}
