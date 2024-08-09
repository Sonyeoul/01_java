package main.java.section01.conditional.question;

public class Question02 {
    public static void main(String[] args) {


        int n =10;
        Question02 q = new Question02();
        q.fibo(n);
        for(int i = 1;i<n;i++){
            System.out.println(fibo(i)+"");
        }

    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int fir = 0;
        int sec = 1;

        for (int i = 2; i <= n; i++) {
            int result = fir + sec;
            fir = sec;
            sec = result;
        }
        return sec;
    }
}
