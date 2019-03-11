package com.gupao.study.pattern.singleton.lazy;

//普通的懒汉式，有线程安全问题
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
