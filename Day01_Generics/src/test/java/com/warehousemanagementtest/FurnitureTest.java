package com.warehousemanagementtest;

import com.warehousemanagementsystem.Furniture;
import com.warehousemanagementsystem.WarehouseItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FurnitureTest {
    @Test
    public void testContructor() {
        WarehouseItem item = new Furniture("Bed");
        assertEquals("Bed", item.getName(), "Constructor did not initialize the name");
    }
}
