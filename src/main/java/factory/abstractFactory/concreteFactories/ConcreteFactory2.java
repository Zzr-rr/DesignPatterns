package factory.abstractFactory.concreteFactories;

import factory.abstractFactory.abstractFactories.AbstractFactory;
import factory.abstractFactory.concreteProducts.*;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ConcreteProductA2 getProductA(String name) {
        return new ConcreteProductA2(name);
    }

    @Override
    public ConcreteProductB2 getProductB(String name) {
        return new ConcreteProductB2(name);
    }

    @Override
    public ConcreteProductC2 getProductC(String name) {
        return new ConcreteProductC2(name);
    }
}
