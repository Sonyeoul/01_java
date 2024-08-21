package main.java.understand;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        
        /*
        * 사용자에게 숫자 두개와 연산자를 입력받는다
        * 입력된 연산을 수행하여 결과출력
        * /는 0으로 할수없기 때문에 예외처리 하고
        * 사용자가 잘못된 연산자를 입력하면 예외처리
        * */
        Scanner input = new Scanner(System.in);
        double result = 0;
        System.out.println("첫번째 숫자 입력");
        int num = input.nextInt();
        System.out.println("두번째 숫자 입력");
        int num2 = input.nextInt();
        try {
            System.out.println("연산할 기호");
            char gihou = input.next().charAt(0);
            if (gihou == '+') {
                result = num + num2;
            } else if (gihou == '-') {
                result = num - num2;
            } else if (gihou == '*') {
                result = num * num2;
            } else if (gihou == '/') {
                if(num2==0) {
                   throw new Exception("0으로 나눌수없음");
                }
                result = num / num2;
            } else if (gihou == '%') {
                if(num2==0) {
                    throw new Exception("0으로 나눌수없음");
                }
                result = num % num2;
            }else{
                throw new Exception("잘못된 기호 입력");
            }
        }catch (Exception e) {
            System.out.println("오류발생");
            e.printStackTrace();
        }
        System.out.println("연산된 값은 : "+result+"이다");
    }
}
