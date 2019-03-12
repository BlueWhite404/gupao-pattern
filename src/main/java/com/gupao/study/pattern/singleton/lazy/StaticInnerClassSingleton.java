package com.gupao.study.pattern.singleton.lazy;

import java.io.Serializable;

//静态内部类
public class StaticInnerClassSingleton implements Serializable {


    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    //保证序列化不回破坏单例
    private Object readResolve(){
        return InnerClass.staticInnerClassSingleton;
    }
}
