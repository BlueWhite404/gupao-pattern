package com.gupao.study.pattern.factory.abstractfactory;

public class Refrigerator implements IRefrigerator {

    public void print(String brand) {
        System.out.println("生产"+brand+"电冰箱");
    }
}
