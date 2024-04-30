package factory.abstractFactory.concreteProducts;

import factory.abstractFactory.abstractProducts.AbstractProductB;

public class ConcreteProductB2 implements AbstractProductB {
    private final String name;

    public ConcreteProductB2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductB2" + this.name;
    }
}
