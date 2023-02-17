package ru.netology;

import java.util.Map;

/**
 * Магические числа - исправил размер массива Purchase[] с прямого значения
 * на данные фактического размера HashMap с продуктами магазина.
 */

public class Purchase implements Operation {

    protected String title;
    protected int count;
    protected Product[] products;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
        products = new Product[Shop.getProducts().size()];
    }

    @Override
    public void addPurchase(String title, int count) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = new Product(title, Shop.getProducts().get(title), count);
                return;
            }
            if (products[i].getTitle().equals(title)) {
                products[i].setCount(products[i].getCount() + count);
                return;
            }
        }
    }

    @Override
    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) continue;
            System.out.println("\t" + product.getTitle() + " " + product.getCount() + " шт. в сумме " +
                    (product.getCount() * prices.get(product.getTitle())) + " руб.");
            sum += product.getCount() * prices.get(product.getTitle());
        }
        return sum;
    }
}
