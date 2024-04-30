package factory.abstractFactory.concreteProducts;

import factory.abstractFactory.abstractProducts.AbstractProductB;

public class ConcreteProductB1 implements AbstractProductB {
    private final String name;

    public ConcreteProductB1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductB1" + this.name;
    }
}
