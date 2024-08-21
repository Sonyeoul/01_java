package main.java;

public class Baek {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        boolean istrue = true;
        while (istrue) {
            i++;
            if((i-666) % 10 != 0) {
                count++;
                System.out.println(i);
            }
            if (i > 10000) {
                return;
            }
        }
    }
}
