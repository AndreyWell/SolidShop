package ru.netology;

import java.util.HashMap;

/**
 * Принцип единой ответственности - убрал из класса Purchase
 * методы с операциями: addPurchase() и sum().
 * Принцип инверсии зависимостей - перенес указанные методы в interface.
 */

public class Products {
    private String name;
    private int price;
    private static HashMap<String, Integer> products;

    public Products() {
        products = new HashMap<>();
    }

    public static void put(String name, int price) {
        products.put(name, price);
    }
    

    public static HashMap<String, Integer> getProducts() {
        return products;
    }
}
