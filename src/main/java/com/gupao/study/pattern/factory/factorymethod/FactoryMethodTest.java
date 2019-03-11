package com.gupao.study.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IBookFactory bookFactory = new MathBookFactory();
        bookFactory.read();

        bookFactory = new ProgramBookFactory();
        bookFactory.read();
    }
}
