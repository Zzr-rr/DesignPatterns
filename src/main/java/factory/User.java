package factory;

import factory.factories.Product1Factory;
import factory.factories.Product2Factory;
import factory.products.Product1;
import factory.products.Product2;

//       Abstract Factory
//      /                \
// Product1Factory  Product2Factory
//      |                 |
//   Product1          Product2
//      \                 /
//       Abstract  Product
public class User {
    public static void main(String[] args) {
        Product1Factory product1Factory = new Product1Factory();
        Product1 product1 = product1Factory.createProduct("alias");
        Product2Factory product2Factory = new Product2Factory();
        Product2 product2 = product2Factory.createProduct("kin");
        System.out.println(product1.getProductName());
        System.out.println(product2.getProductName());
    }
}
