package com.gupao.study.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class MessageNotifyTest {
    public static void main(String[] args) {
        Posts posts = new Posts();
        posts.setQuestion("guava测试");
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher();
        eventBus.register(teacher);
        eventBus.post(posts);
    }
}
