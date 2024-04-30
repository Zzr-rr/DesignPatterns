package factory.abstractFactory.concreteProducts;


import factory.abstractFactory.abstractProducts.AbstractProductA;

public class ConcreteProductA1 implements AbstractProductA {
    private final String name;

    public ConcreteProductA1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "ProductA1" + this.name;
    }
}
