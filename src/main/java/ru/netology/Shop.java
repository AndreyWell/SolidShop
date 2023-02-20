package ru.netology;

import java.util.ArrayList;
import java.util.List;

/**
 * Принцип единой ответственности - вынес формирование набора продуктов
 * в отдельный класс Shop
 */

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void put(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
