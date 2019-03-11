package com.gupao.study.pattern.singleton.lazy;

//静态内部类
public class StaticInnerClassSingleton {


    private StaticInnerClassSingleton(){

    }

    public StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
}
