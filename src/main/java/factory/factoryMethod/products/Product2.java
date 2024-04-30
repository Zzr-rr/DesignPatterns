package factory.factoryMethod.products;

import factory.factoryMethod.AbstractProduct;

public class Product2 implements AbstractProduct {
    private String name;
    public Product2(String name){
        this.name = name;
    }
    @Override
    public String getProductName() {
        return "Product2 : " + name;
    }
}
