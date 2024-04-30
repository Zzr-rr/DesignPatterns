package factory.factories;

import factory.AbstractFactory;
import factory.AbstractProduct;
import factory.products.Product1;

public class Product1Factory implements AbstractFactory {
    @Override
    public Product1 createProduct(String name) {
        return new Product1(name);
    }
}
