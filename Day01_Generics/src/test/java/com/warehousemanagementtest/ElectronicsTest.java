package com.warehousemanagementtest;

import com.warehousemanagementsystem.Electronics;
import com.warehousemanagementsystem.WarehouseItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicsTest {
    @Test
    public void testConstructor() {
        WarehouseItem item = new Electronics("Mobile");
        assertEquals("Mobile", item.getName(), "Constructor did not initialize the name");
    }
}
