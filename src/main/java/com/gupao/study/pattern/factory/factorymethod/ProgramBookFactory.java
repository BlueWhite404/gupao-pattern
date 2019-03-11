package com.gupao.study.pattern.factory.factorymethod;

public class ProgramBookFactory implements IBookFactory {
    public void read() {
        System.out.println("读技术书");
    }
}
