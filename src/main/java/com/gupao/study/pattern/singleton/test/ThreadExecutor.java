package com.gupao.study.pattern.singleton.test;

import com.gupao.study.pattern.singleton.hungry.HungrySingleton;
import com.gupao.study.pattern.singleton.lazy.LazySingleton;

public class ThreadExecutor implements Runnable{


    public void run() {
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+hungrySingleton);
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
