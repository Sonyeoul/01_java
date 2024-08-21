package main.java.question.bank;

import java.util.Scanner;

public class Aoo {
    public static void main(String[] args) {
        BankAccout arr[] = new BankAccout[1];
        int num = 0;


        while (true) {
            System.out.println("1.계좌 생성 2.입금 3.출금 4.잔액조회 9.종료");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.println("생성할 계좌 입력 : ");
                    String num1 = sc.nextLine();
                    System.out.println("이름 입력 : ");
                    String name = sc.nextLine();
                    int money = 0;
                    arr[0] = new BankAccout(num1, name, money);

                    break; //계좌 생성
                case 2:
                    input();
                    break; //입금
                case 3: output();
                    break; //출금
                case 4: inquiry();
                    break; //잔액조회
                case 9:
                    return; //종료
                default:
                    System.out.println("잘못입력");
            }
        }
    }


    public static void input() {
        BankAccout arr = new BankAccout();
        Scanner sc = new Scanner(System.in);
        System.out.println("입금할 금액 :");
        arr.setMoney(arr.getMoney()+sc.nextInt());
        System.out.println("잔액"+arr.getMoney());
    }

    public static void output() {
        BankAccout arr = new BankAccout();
        Scanner sc = new Scanner(System.in);
        System.out.println("출금할 금액 :");
        int a = arr.getMoney();
        int b = sc.nextInt();
        int result = a-b;
        arr.setMoney(result);
        System.out.println("잔액"+arr.getMoney());
    }

    public static void inquiry() {
        BankAccout arr = new BankAccout();
        System.out.println("잔액 :" + arr.getMoney());

    }
}
