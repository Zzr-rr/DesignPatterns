package factory.abstractFactory.concreteFactories;

import factory.abstractFactory.abstractFactories.AbstractFactory;
import factory.abstractFactory.concreteProducts.*;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ConcreteProductA1 getProductA(String name) {
        return new ConcreteProductA1(name);
    }

    @Override
    public ConcreteProductB1 getProductB(String name) {
        return new ConcreteProductB1(name);
    }

    @Override
    public ConcreteProductC1 getProductC(String name) {
        return new ConcreteProductC1(name);
    }
}
