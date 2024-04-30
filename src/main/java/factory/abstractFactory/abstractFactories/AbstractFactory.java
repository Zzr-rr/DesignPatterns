package factory.abstractFactory.abstractFactories;

import factory.abstractFactory.abstractProducts.AbstractProductA;
import factory.abstractFactory.abstractProducts.AbstractProductB;
import factory.abstractFactory.abstractProducts.AbstractProductC;

public interface AbstractFactory {
    public AbstractProductA getProductA(String name);
    public AbstractProductB getProductB(String name);
    public AbstractProductC getProductC(String name);
}
