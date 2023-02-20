package ru.netology;

import java.util.ArrayList;
import java.util.List;

/**
 * Магические числа - исправил размер массива Purchase[] с прямого значения
 * на данные фактического размера HashMap с продуктами магазина.
 */

public class Purchase implements Operation {

    protected String title;
    protected int count;
    protected List<Product> products;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
        products = new ArrayList<>();
    }

    @Override
    public void addPurchase(Product product) {
        if (products.size() == 0) {
            products.add(product);
            return;
        }

        int selector = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getTitle().equals(product.getTitle())) {
                products.get(i).setCount(products.get(i).getCount() + product.getCount());
                selector++;
                return;
            }
        }

        if (selector == 0) {
            products.add(product);
        }

    }

    @Override
    public long sum(List<Product> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product == null) continue;
            for (Product price : prices) {
                if (price.getTitle().equals(product.getTitle())) {
                    System.out.println("\t" + product.getTitle() + " " + product.getCount() + " шт. в сумме " +
                            (product.getCount() * price.getPrice()) + " руб.");
                    sum += product.getCount() * price.getPrice();
                    break;
                }
            }
        }
        return sum;
    }
}
