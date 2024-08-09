package main.java.section02.demantional;

public class Copy {
    public static void main(String[] args) {

        String [] name = {"배고파","점심","먹고싶다"};

        System.out.println(name.hashCode());

        copy(name);
        String[] animal = getani();


        //앝은 복사 활용해 매개변수와 리턴값
    }
    public static void copy(String [] args) {
        System.out.println(args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]+" ");
        }
        System.out.println();
    }
    public static String[] getani() {
        String [] animals = {"낙타","호랑이","나무늘보"};
        return animals;
    }
}
