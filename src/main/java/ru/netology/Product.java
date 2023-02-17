package ru.netology;

/**
 * Принцип единой ответственности - убрал из класса Purchase
 * методы с операциями: addPurchase() и sum().
 * Принцип инверсии зависимостей - перенес указанные методы в interface.
 */

public class Product {
    private String title;
    private int price;
    private int count;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Product(String title, int price, int amount) {
        this.title = title;
        this.price = price;
        this.count = amount;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
