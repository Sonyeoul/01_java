package main.java.question.store;

import java.util.ArrayList;
import java.util.Scanner;

import static main.java.question.store.App.list;

public class Order {
    Scanner sc = new Scanner(System.in);
    OrderItem oItem = new OrderItem();

    public ArrayList<Product> oderedItem(){
        System.out.println("구매하실 제품 명을 입력 : ");
        String item = sc.nextLine();
        for( Product p : list){
        if(p.getName().equals(item)) {
            if(p.getStock() !=0){
                p.setStock(p.getStock() - 1);
                oItem.setItemSet(+1);
            }
        }
    }
        return list;
    }
    public void oderCash(){

    }
}
