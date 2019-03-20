package com.gupao.study.pattern.observer.jdk;

import java.util.Observable;

public class Gper extends Observable {

    private static Gper gper;

    private Gper(){
        if(gper != null){
            throw new RuntimeException("不要想反射攻击我");
        }
    }

    public static Gper getInstance(){
        if(gper == null){
            gper = new Gper();
        }
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在咕泡社区提了提了一个问题，问题内容是"+question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
