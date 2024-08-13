package main.java.section06.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달받은값 :"+num);
    }
    public void testPrimaryTypeArrayParameter(int[] arr) {
        System.out.println("매개변수로 전달받은값" + arr);

        System.out.println("배열값");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        arr[0]=99;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public void testClassTypeParameter(Rect rect) {
        System.out.println("매개변수로 전달바은 값: "+rect);
        System.out.println("변경전 사각형의 넓이와 둘래 = " );
        rect.calcArea();
        rect.calcRound();
        System.out.println("변경후 사격형의 넓이와 둘래 = ");
        rect.setWidth(100);
        rect.setHeight(100);
        rect.calcArea();
        rect.calcRound();

    }
}
