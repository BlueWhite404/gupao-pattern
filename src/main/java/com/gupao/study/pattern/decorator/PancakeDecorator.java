package com.gupao.study.pattern.decorator;

public abstract class PancakeDecorator extends Pancake{

    private Pancake pancake;

    public PancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    public String getMessage(){
        return pancake.getMessage();
    }

    public Integer getPrice(){
        return pancake.getPrice();
    }
}
