package ru.netology;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products prod = new Products();
        Products.put("Хлеб", 56);
        Products.put("Масло", 153);
        Products.put("Колбаса", 211);
        Products.put("Пирожок", 45);
        Products.put("Сырок", 15);

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : Products.getProducts().entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Operations purchase = new Purchase();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum(Products.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}
