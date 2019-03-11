package com.gupao.study.pattern.factory.simplefactory;

public class SimpleFactory {

    public static IPlan createPlan(Class<? extends IPlan> clazz){
        IPlan plan = null;
        try {
            plan = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return plan;
    }
}
