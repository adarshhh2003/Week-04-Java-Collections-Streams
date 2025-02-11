package com.warehousemanagementsystem;
// abstract class represent warehouse item
public abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
