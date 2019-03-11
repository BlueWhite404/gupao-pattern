package com.gupao.study.pattern.factory.abstractfactory;

public interface IApplianceFactory {

    public ITelevision getTelevision();

    public ICashier getCashier();

    public IRefrigerator getRefrigerator();

    public IAirCondition getAirCondition();
}
