package prototype;

public class User {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original data.");
        original.getData();
        ConcretePrototype clone = (ConcretePrototype) original.clone();
        System.out.println(clone.getData());
    }
}
