package com.gupao.study.pattern.singleton.register;

public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
