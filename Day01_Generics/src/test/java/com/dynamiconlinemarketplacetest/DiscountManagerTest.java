package com.dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DiscountManagerTest {
    private Catalog catalog;
    private Gadget phone;

    @BeforeEach
    public void setUp() {
        catalog = new Catalog();
        phone = new Gadget("Smart Phone", 5000.0, GadgetCategory.ACCESSORY);
    }
    @Test
    public void testApplyDiscount() {
        List<Product<?>> products = catalog.getProducts();
        catalog.addProduct(phone);
        double beforeDiscount = phone.getPrice();

        DiscountManager.applyDiscount(phone, 10);

        assertNotEquals(beforeDiscount, phone.getPrice());
    }
}
