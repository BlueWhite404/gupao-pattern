package com.gupao.study.pattern.decorator;

public class PancakeTest {

    public static void main(String[] args) {
        Pancake pa = new Pancake();
        System.out.println(pa.getMessage()+",价格为"+pa.getPrice()+"元");

        pa = new EggDecorator(pa);
        System.out.println(pa.getMessage()+",价格为"+pa.getPrice()+"元");

        pa = new ChickenDecorator(pa);
        System.out.println(pa.getMessage()+",价格为"+pa.getPrice()+"元");
    }
}
