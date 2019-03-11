package com.gupao.study.pattern.factory.abstractfactory;

public class Cashier implements ICashier {


    public void print(String brand) {
        System.out.println("生产"+brand+"洗衣机");
    }
}
