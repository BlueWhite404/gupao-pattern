package com.gupao.study.pattern.decorator;

public class EggDecorator extends PancakeDecorator{

    public EggDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"加一个鸡蛋";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 1;
    }
}
