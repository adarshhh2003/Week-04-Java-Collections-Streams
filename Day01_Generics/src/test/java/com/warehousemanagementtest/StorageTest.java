package com.warehousemanagementtest;

import com.warehousemanagementsystem.Electronics;
import com.warehousemanagementsystem.Storage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageTest {
    private Storage<Electronics> electronicsStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
    }

    @Test
    public void testAddItem() {
        Electronics laptop = new Electronics("Laptop");
        electronicsStorage.addItem(laptop);

        List<Electronics> items = electronicsStorage.getItems();

        assertEquals(false, items.isEmpty(), "Storage should not be empty after adding an item");
        assertEquals(1, items.size(), "Storage only contains only one item");
        assertEquals("Laptop", items.get(0).getName(), "Stored item matched the added item");
    }

    @Test
    public void testRetrieveItem() {
        List<Electronics> items  = electronicsStorage.getItems();
        assertEquals(null, electronicsStorage.retrieveItem(0), "Item should be deleted from the storage");
        assertEquals(0, items.size(), "Storage does not contain any item");
    }
}
