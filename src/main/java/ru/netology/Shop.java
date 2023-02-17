package ru.netology;

import java.util.HashMap;
import java.util.Map;

/**
 * Принцип единой ответственности - вынес формирование набора продуктов
 * в отдельный класс Shop
 */

public class Shop {
    private static Map<String, Integer> products;

    public Shop() {
        products = new HashMap<>();
    }

    public static void put(Product product) {
        products.put(product.getTitle(), product.getPrice());
    }

    public static Map<String, Integer> getProducts() {
        return products;
    }
}
