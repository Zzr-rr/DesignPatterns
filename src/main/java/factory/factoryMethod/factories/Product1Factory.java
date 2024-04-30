package factory.factoryMethod.factories;

import factory.factoryMethod.AbstractFactory;
import factory.factoryMethod.products.Product1;

public class Product1Factory implements AbstractFactory {
    @Override
    public Product1 createProduct(String name) {
        return new Product1(name);
    }
}
