package com.gupao.study.pattern.singleton.register;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date
 * @Version 1.0
 **/
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static ConcurrentHashMap<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }

}
