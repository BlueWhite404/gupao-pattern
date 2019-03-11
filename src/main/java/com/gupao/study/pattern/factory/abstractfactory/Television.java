package com.gupao.study.pattern.factory.abstractfactory;

public class Television implements ITelevision{

    public void print(String brand) {
        System.out.println("生产"+brand+"电视机");
    }
}
