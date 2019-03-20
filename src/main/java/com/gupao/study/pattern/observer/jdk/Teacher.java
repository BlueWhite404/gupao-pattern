package com.gupao.study.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {


    public void update(Observable o, Object arg) {
        Gper gper = (Gper)o;
        Question question = (Question) arg;

        System.out.println("=================");
        System.out.println("您收到来自咕泡社区的一个提问，问题内容如下：");
        System.out.println(question.getContent());
        System.out.println("提问者是："+ question.getUserName());
    }
}
