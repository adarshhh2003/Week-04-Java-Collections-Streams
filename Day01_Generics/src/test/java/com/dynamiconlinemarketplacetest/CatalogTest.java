package com.dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.Catalog;
import com.dynamiconlinemarketplace.Clothing;
import com.dynamiconlinemarketplace.ClothingCategory;
import com.dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogTest {
    private Catalog catalog;
    private Clothing shirt;
    @BeforeEach
    public void setUp() {
        shirt = new Clothing("Shirt", 500.0, ClothingCategory.MEN);
        catalog = new Catalog();
    }

    @Test
    public void testAddProduct() {
        List<Product<?>> products = catalog.getProducts();
        catalog.addProduct(shirt);

        assertEquals(1, products.size(), "Porduct should not be empty after adding of an item");

        assertEquals("Shirt", products.get(0).getName(), "Product contains some items");
    }

    @Test
    public void testShowCatalog() {
        List<Product<?>> products = catalog.getProducts();
        catalog.addProduct(shirt);

        assertEquals(1, products.size(), "Size must be equal to the number of products");

        assertEquals("Shirt", products.get(0).getName(), "Product must return the items");
    }
}
