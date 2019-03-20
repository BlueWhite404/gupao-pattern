package com.gupao.study.pattern.observer.jdk;

public class ObserverTest {

    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Question question = new Question();
        question.setUserName("GP16855");
        question.setContent("观察者模式试写");


        gper.addObserver(new Teacher());
        gper.publishQuestion(question);

    }
}
