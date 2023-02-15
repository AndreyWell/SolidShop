package ru.netology;

/**
 * Принцип единой ответственности - убрал из класса Purchase
 * методы с операциями: addPurchase() и sum().
 * Принцип инверсии зависимостей - перенес указанные методы в interface.
 */

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
