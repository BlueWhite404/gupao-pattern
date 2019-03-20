package com.gupao.study.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    @Subscribe
    public void receive(Object message){
        Posts posts = (Posts) message;

        System.out.println("=================");
        System.out.println("您收到来自咕泡社区的一个提问，问题内容如下：");
        System.out.println(posts.getQuestion());
        System.out.println("提问者是："+ posts.getSno());
    }
}
