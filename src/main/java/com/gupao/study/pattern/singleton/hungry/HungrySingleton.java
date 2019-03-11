package com.gupao.study.pattern.singleton.hungry;

/**
 * 饿汉
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();


    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
