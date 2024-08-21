package main.java.section01.exception;

public class ExceoptionTest {
    public void checkMoney(int price,int money) throws Exception {
        System.out.println("가지고 있는 돈은"+money+"원 입니다");
        
        if(money>=price){
            System.out.println("물건을 구매하기엔 돈이 충분함");
        }else{ //강제로 예외발생 메소드 헤드에 throws 구문 추가
            throw new Exception();
        }
        System.out.println("구매가능");
    }
}
