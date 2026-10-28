package ru.netology.service;

public class CustomsService {
    public static final int PRICE_PER_KG = 100;

    public static int calculateCustoms(int price, int weight) {
        int dutyPrice = price / 100;
        int dutyWeight = weight * PRICE_PER_KG;
        int result = dutyPrice + dutyWeight;
        return result;
    }
}
