package factory.abstractFactory.concreteProducts;

import factory.abstractFactory.abstractProducts.AbstractProductA;

public class ConcreteProductA2 implements AbstractProductA {
    private final String name;

    public ConcreteProductA2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductA2" + this.name;
    }
}

