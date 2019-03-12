package com.gupao.study.pattern.prototype;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date
 * @Version 1.0
 **/
public class OrderTest {


    public static final int MAN = 1;

    public static void main(String[] args) {
        Order souOrder = new Order();
        Person person = new Person();
        person.setName("tom老师666");
        person.setAge(18);
        person.setSex(MAN);
        souOrder.setCreatePerson(person);
        souOrder.setCreateTime(new Date());
        souOrder.setAmount(new BigDecimal(1));
        souOrder.setOrderState("success");

        //浅拷贝
        Order desShallowOrder = Order.shallowClone(souOrder);
        System.out.println(desShallowOrder.getCreatePerson() == souOrder.getCreatePerson());

        //深拷贝
        Order desDeepOrder = Order.deepClone(souOrder);

        System.out.println(desDeepOrder.getCreatePerson() == souOrder.getCreatePerson());
    }
}
