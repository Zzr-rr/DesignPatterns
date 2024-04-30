package singleton;

public class HungrySingleton {
    private Object attributes;
    private HungrySingleton(){};
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }
}
