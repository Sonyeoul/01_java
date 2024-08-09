package main.java.section01.conditional.question;

import static java.lang.System.*;

public class Sugar {


    public static void main(String[] args) {

        int primekg = 14;
        int count = 0;
        int a1= 0;

        while(primekg>0){
            if(primekg%5==0) {
                count+=primekg/5;
                primekg=0;
            }else{
                primekg -=3;
                count++;
            }
            if(primekg < 0){
                count = -1;
                break;
            }
        }

        out.println(count);
    }
}

