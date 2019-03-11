package com.gupao.study.pattern.factory.factorymethod;

public class MathBookFactory implements IBookFactory {
    public void read() {
        System.out.println("读数学书");
    }
}
