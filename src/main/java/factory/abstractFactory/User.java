package factory.abstractFactory;

import factory.abstractFactory.concreteFactories.ConcreteFactory1;
import factory.abstractFactory.concreteFactories.ConcreteFactory2;
import factory.abstractFactory.concreteProducts.*;

public class User {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        ConcreteProductA1 concreteProductA1 = concreteFactory1.getProductA("a1");
        ConcreteProductB1 concreteProductB1 = concreteFactory1.getProductB("b1");
        ConcreteProductC1 concreteProductC1 = concreteFactory1.getProductC("c1");
        ConcreteProductA2 concreteProductA2 = concreteFactory2.getProductA("a2");
        ConcreteProductB2 concreteProductB2 = concreteFactory2.getProductB("b2");
        ConcreteProductC2 concreteProductC2 = concreteFactory2.getProductC("c2");
        System.out.println(concreteProductA1.getName());
        System.out.println(concreteProductB1.getName());
        System.out.println(concreteProductC1.getName());
        System.out.println(concreteProductA2.getName());
        System.out.println(concreteProductB2.getName());
        System.out.println(concreteProductC2.getName());
    }
}
