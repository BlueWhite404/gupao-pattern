package com.gupao.study.pattern.factory.abstractfactory;

public class XiaoMiFactory implements IApplianceFactory {

    public ITelevision getTelevision() {
        return new Television();
    }

    public ICashier getCashier() {
        return new Cashier();
    }

    public IRefrigerator getRefrigerator() {
        return new Refrigerator();
    }

    public IAirCondition getAirCondition() {
        return null;
    }
}
