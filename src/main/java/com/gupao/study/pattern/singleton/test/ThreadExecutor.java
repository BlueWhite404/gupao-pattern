package com.gupao.study.pattern.singleton.test;

import com.gupao.study.pattern.singleton.hungry.HungrySingleton;
import com.gupao.study.pattern.singleton.lazy.LazySingleton;
import com.gupao.study.pattern.singleton.lazy.StaticInnerClassSingleton;

public class ThreadExecutor implements Runnable{


    public void run() {
        //饿汉
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+hungrySingleton);
        //懒汉（简单懒汉）
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
        //懒汉（静态内部类）
        StaticInnerClassSingleton innerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+innerClassSingleton);
    }
}
