package com.warehousemanagementtest;

import com.warehousemanagementsystem.Furniture;
import com.warehousemanagementsystem.Storage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarehouseUtilsTest {
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    public void setUp() {
        furnitureStorage = new Storage<>();
    }

    @Test
    public void testDisplayItems() {
        Furniture bed = new Furniture("Bed");
        Furniture chair = new Furniture("Chair");
        List<Furniture> items = furnitureStorage.getItems();

        furnitureStorage.addItem(bed);
        furnitureStorage.addItem(chair);

        assertEquals("Bed", items.get(0).getName(), "Storage must display the contained items");
        assertEquals("Chair", items.get(1).getName(), "Storage must display the contained items");
    }
}
