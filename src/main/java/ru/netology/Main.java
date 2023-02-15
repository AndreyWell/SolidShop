package ru.netology;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Shop.put(new Product("Хлеб", 56));
        Shop.put(new Product("Масло", 153));
        Shop.put(new Product("Колбаса", 211));
        Shop.put(new Product("Пирожок", 45));
        Shop.put(new Product("Сырок", 15));

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : Shop.getProducts().entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Operation purchase = new Purchase();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum(Shop.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}
