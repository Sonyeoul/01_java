package main.java.section07.variable;

public class KindValue {

    private static int staticNum;
    private int globalNum;
    public  void testMethod(int num){
        //메서드안에 작성한 변수는 지역변수
        int localNum;
        //매개변수 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요없다
        System.out.println(staticNum);
        System.out.println(globalNum);
    }

    public void tsetMethod2(){

        System.out.println(staticNum);
        System.out.println(globalNum);
    }
}
