package com.gupao.study.pattern.singleton.test;

import com.gupao.study.pattern.singleton.lazy.StaticInnerClassSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Author chenghu
 * @Descripion 静态内部类测试
 * @Date
 **/
public class StaticInnerClassSingletonTest {

    public static void main(String[] args) {
        //1.线程安全测试 通过
//        Thread t1 = new Thread(new ThreadExecutor());
//
//        Thread t2 = new Thread(new ThreadExecutor());
//
//        t1.start();
//
//        t2.start();


        //2.序列化测试   不通过
//        StaticInnerClassSingleton innerClassSingleton1 = StaticInnerClassSingleton.getInstance();
//
//        StaticInnerClassSingleton innerClassSingleton2 = null;
//
//        try {
//            FileOutputStream fos = new FileOutputStream("innerClassSingleton2");
//            ObjectOutputStream oop = new ObjectOutputStream(fos);
//            oop.writeObject(innerClassSingleton1);
//            oop.close();
//            fos.flush();
//            fos.close();
//
//            FileInputStream fis = new FileInputStream("innerClassSingleton2");
//            ObjectInputStream oip = new ObjectInputStream(fis);
//            innerClassSingleton2 = (StaticInnerClassSingleton) oip.readObject();
//            oip.close();
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(innerClassSingleton1);
//        System.out.println(innerClassSingleton2);
//        System.out.println(innerClassSingleton1 == innerClassSingleton2);

        //3.反射测试  未通过
        try {
            Class<?> clazz = StaticInnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object1 = constructor.newInstance();
            Object object2 = constructor.newInstance();

            System.out.println(object1);
            System.out.println(object2);
            System.out.println(object1 == object2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
