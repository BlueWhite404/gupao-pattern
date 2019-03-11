package com.gupao.study.pattern.factory.abstractfactory;

public class AirCondition implements IAirCondition{


    public void print(String brand) {
        System.out.println("生产"+brand+"空调");
    }
}
