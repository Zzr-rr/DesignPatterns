package singleton;

public class LazySingleton {
    private Object attributes;
    private static volatile LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
