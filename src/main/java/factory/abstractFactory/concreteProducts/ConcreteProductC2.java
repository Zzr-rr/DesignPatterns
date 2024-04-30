package factory.abstractFactory.concreteProducts;

import factory.abstractFactory.abstractProducts.AbstractProductC;

public class ConcreteProductC2 implements AbstractProductC {
    private final String name;

    public ConcreteProductC2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductC2" + this.name;
    }
}
