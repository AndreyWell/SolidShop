package ru.netology;

import java.util.List;
import java.util.Map;

/**
 * Принцип инверсии зависимостей - использование методов
 * addPurchase() и sum() через интерфейс
 */

public interface Operation {
    void addPurchase(Product product);
    long sum(List<Product> prices);
}
