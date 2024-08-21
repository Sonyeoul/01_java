package main.java.question.store;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Product> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        list.add(new Product("침대",130000,3));
        list.add(new Product("의자",17000,9));
        list.add(new Product("책상",120000,5));
        list.add(new Product("배게",10000,14));

        while(true) {
            System.out.println("1. 회원가입 2. 제품 목록 조회 3.제품 주문 4. 주문 내역 조회 9. 종료");
            int num = sc.nextInt();
            switch(num) {
                case 1: customer.memberadd(); break;  //회원가입창
                case 2: itemlist(); break; //제품 목록
                case 3:  break; //제품 주문
                case 4: break; //주문내역조회
                case 9: break; //
                default: return;
            }
        }
    }
    public static void itemlist(){
        for(Product p : list) {
            System.out.println(p);
        }
    }


}
