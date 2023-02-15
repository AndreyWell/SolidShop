package ru.netology;

import java.util.Map;

/**
 * Магические числа - исправил размер массива Purchase[] с прямого значения
 * на данные фактического размера HashMap с продуктами магазина.
 */

public class Purchase implements Operations {

    protected String title;
    protected int count;
    protected Purchase[] purchases;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
        purchases = new Purchase[Shop.getProducts().size()];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
