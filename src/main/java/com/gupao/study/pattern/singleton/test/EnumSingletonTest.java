package com.gupao.study.pattern.singleton.test;

import com.gupao.study.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {
        //1.测试序列化，通过
//        EnumSingleton enumSingleton = EnumSingleton.getInstance();
//        enumSingleton.setData(new Object());
//
//        EnumSingleton enumSingleton1 = null;
//
//        try{
//            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj1");
//            ObjectOutputStream ops = new ObjectOutputStream(fos);
//            ops.writeObject(enumSingleton);
//            ops.flush();
//            ops.close();
//            fos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj1");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            enumSingleton1 = (EnumSingleton) ois.readObject();
//            ois.close();
//            fis.close();
//
//            System.out.println(enumSingleton.getData());
//            System.out.println(enumSingleton1.getData());
//            System.out.println(enumSingleton.getData() == enumSingleton1.getData());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //2.测试反射 通过
        try {
            Class<?> clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object1 = constructor.newInstance();
            Object object2 = constructor.newInstance();
            System.out.println(object1 == object2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
