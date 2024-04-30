package factory.factories;

import factory.AbstractFactory;
import factory.AbstractProduct;
import factory.products.Product2;

public class Product2Factory implements AbstractFactory {
    @Override
    public Product2 createProduct(String name) {
        return new Product2(name);
    }
}
