package proxy;

public class User {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
