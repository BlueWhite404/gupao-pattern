package com.gupao.study.pattern.singleton.lazy;

//双重校验锁，线程安全
public class DoubleCheckSingleton {

    private DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){

    }

    public DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton =  new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
