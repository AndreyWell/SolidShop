package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.put(new Product("Хлеб", 56));
        shop.put(new Product("Масло", 153));
        shop.put(new Product("Колбаса", 211));
        shop.put(new Product("Пирожок", 45));
        shop.put(new Product("Сырок", 15));

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Product product : shop.getProducts()) {
            System.out.println(product.getTitle() + " за " + product.getPrice() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Operation purchase = new Purchase();
        Product product;
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String productStr = parts[0];
            int count = Integer.parseInt(parts[1]);
            for (Product shopProduct : shop.getProducts()) {
                if (shopProduct.getTitle().equals(productStr)) {
                    product = new Product(productStr, shopProduct.getPrice(), count);
                    purchase.addPurchase(product);
                    break;
                }
            }
        }
        long sum = purchase.sum(shop.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}
