package main.java.section03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("test.dat"));
        } catch (FileNotFoundException e) {
            System.out.println("에러발생");
            e.printStackTrace();
     }finally {
            System.out.println("finally 실행");
        }
    }

}
