package factory.products;

import factory.AbstractProduct;

public class Product1 implements AbstractProduct {
    private final String name;
    public Product1(String name){
        this.name = name;
    }
    @Override
    public String getProductName() {
        return "Product1 : " + name;
    }
}
