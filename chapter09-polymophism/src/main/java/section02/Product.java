package main.java.section02;

public abstract class Product {
    private int nonstatic;
    private static int staticfeild;

    public Product() {}


    public void  nonstaticMethod(){
        System.out.println("Product에 논 스태틱 메서드 호출");
    }
    public  static void staticMethod(){
        System.out.println("Product에 스태틱 메서드 호출");
    }

    public abstract void abstractMethod();
}


