package main.java.section07.singleton;

public class LazySingleton {
    private static LazySingleton lazy;
    private LazySingleton() {
        System.out.println("lazy 생성됨");
    }

    public static LazySingleton getInstance() {
        if(lazy == null) {
            System.out.println("lazy is null");
            lazy = new LazySingleton();
        }
        System.out.println("lazy is not null");
        return lazy;
    }

}
