package main.java.question.store;

import java.util.Scanner;

public class Customer {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String id;

    public Customer() {
    }

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    public void memberadd() {
        System.out.println("이름 입력 : ");
        setName(sc.nextLine());
        System.out.println("ID 입력 : ");
        setId(sc.nextLine());
    }



    public void addOder(){

    }
    public void oderCheck(){


    }


}
