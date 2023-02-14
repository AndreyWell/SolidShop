package ru.netology;

import java.util.Map;

/**
 * Принцип инверсии зависимостей - использование методов
 * addPurchase() и sum() через интерфейс
 */

public interface Operations {
    void addPurchase(String title, int count);
    long sum(Map<String, Integer> prices);
}
