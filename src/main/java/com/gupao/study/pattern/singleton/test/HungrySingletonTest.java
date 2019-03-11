package com.gupao.study.pattern.singleton.test;

import com.gupao.study.pattern.singleton.hungry.HungrySingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadExecutor());

        Thread t2 = new Thread(new ThreadExecutor());

        t1.start();

        t2.start();
    }

}
