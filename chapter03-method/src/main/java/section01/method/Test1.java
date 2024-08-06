package main.java.section01.method;

public class Test1 {
    public static void main(String[] args) {

        Test1 t = new Test1();

        int c= t.math(1,2);
        int d= t.minus(1,2);
        int e= t.mlx(1,2);
        int f= t.mul(1,2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
    public int math (int a, int b) {
        return a + b;
    }
    public  int minus (int a, int b) {
        return b - a;
    }
    public int mlx(int a, int b) {
        return a * b;
    }
    public int mul (int a, int b) {
        return a / b;
    }
}
