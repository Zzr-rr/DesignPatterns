package factory.abstractFactory.concreteProducts;

import factory.abstractFactory.abstractProducts.AbstractProductC;

public class ConcreteProductC1 implements AbstractProductC {
    private final String name;

    public ConcreteProductC1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductC1" + this.name;
    }
}
