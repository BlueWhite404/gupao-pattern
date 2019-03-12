package com.gupao.study.pattern.singleton.lazy;

import java.io.Serializable;

//静态内部类
public class StaticInnerClassSingleton implements Serializable {


    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
}
