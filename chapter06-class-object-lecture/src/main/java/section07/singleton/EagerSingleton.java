package main.java.section07.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {
    }
    public static EagerSingleton getInstance() {
        return eager;
    }
}
