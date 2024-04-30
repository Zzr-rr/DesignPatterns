package singleton;

public class User {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(hungrySingleton.getClass());
        System.out.println(lazySingleton.getClass());
    }
}
