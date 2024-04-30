package factory.factoryMethod.factories;

import factory.factoryMethod.AbstractFactory;
import factory.factoryMethod.products.Product2;

public class Product2Factory implements AbstractFactory {
    @Override
    public Product2 createProduct(String name) {
        return new Product2(name);
    }
}
