package com.warehousemanagementtest;

import com.warehousemanagementsystem.Electronics;
import com.warehousemanagementsystem.WarehouseItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarehouseItemTest {
    @Test
    public void testConstructor() {
        WarehouseItem item = new Electronics("Laptop");
        assertEquals("Laptop", item.getName(), "Constructor did not initialize name correctly");
    }

    @Test
    public void testGetName() {
        WarehouseItem item = new Electronics("Laptop");
        assertEquals("Laptop", item.getName(), "Getter method is incorrect");
    }
}
