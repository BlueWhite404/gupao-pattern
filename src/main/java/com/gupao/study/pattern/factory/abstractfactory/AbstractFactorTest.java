package com.gupao.study.pattern.factory.abstractfactory;

public class AbstractFactorTest {

    public static void main(String[] args) {
        HaierFactory haierFactory = new HaierFactory();
        haierFactory.getCashier().print("haier");
        haierFactory.getAirCondition().print("haier");
        haierFactory.getRefrigerator().print("haier");
        haierFactory.getTelevision().print("haier");
    }
}
