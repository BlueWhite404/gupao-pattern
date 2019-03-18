package com.gupao.study.pattern.decorator;

public class ChickenDecorator extends PancakeDecorator{

    public ChickenDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"加一块鸡肉";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice()+5;
    }
}
