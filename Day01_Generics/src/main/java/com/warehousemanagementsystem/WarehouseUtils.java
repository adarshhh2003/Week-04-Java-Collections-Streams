package com.warehousemanagementsystem;

import java.util.List;
// Utility method to display all items using wildcard
public class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for(WarehouseItem item: items) {
            System.out.println(item.getName());
        }
    }
}
