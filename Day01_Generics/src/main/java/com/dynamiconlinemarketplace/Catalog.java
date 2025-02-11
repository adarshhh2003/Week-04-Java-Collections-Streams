package com.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public List<Product<?>> getProducts() {
        return products;
    }

    public void showCatalog() {
        for(Product<?> product: products) {
            product.displayProduct();
        }
    }
}
