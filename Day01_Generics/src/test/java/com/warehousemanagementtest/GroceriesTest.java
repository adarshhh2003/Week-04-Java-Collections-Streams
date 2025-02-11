package com.warehousemanagementtest;

import com.warehousemanagementsystem.Groceries;
import com.warehousemanagementsystem.WarehouseItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceriesTest {
    @Test
    public void testConstructor() {
        WarehouseItem item = new Groceries("Milk");
        assertEquals("Milk", item.getName(), "Constructor did not initialize the name");
    }
}
