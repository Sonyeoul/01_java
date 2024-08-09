package main.java.section03;

public class Question04 {

    public static void main(String[] args) {

        String cardForm [] = {"Heart","Space","Clover","Diamond"};
        String cardNum [] ={"A","2","3","4","5","6","7","8","9","10","jack","queen","king"} ;


        for(int i = 0; i < 10; i++) {
            int num =(int) (Math.random()*13);
            int form = (int) (Math.random()*4);
            System.out.println(cardForm[form] +" "+ cardNum[num]);
        }




    }
}



