package main.java.section06.parameter;

public class App {
    public static void main(String[] args) {

        //메소드의 파라미터에 대해 이해하고 사용가능

        /*
        * 기본 자료형
        * 기본 자료형 배열
        * 클래스 자료형
        * 클래스 자료형 배열
        * 가변인자
        *
        * */
        ParameterTest pt = new ParameterTest();
        int num = 20;
        int arr[] = {20,20,54,2,48,45};
        pt.testPrimaryTypeParameter(num);
        pt.testPrimaryTypeArrayParameter(arr);

        Rect re= new Rect(12.5,22.5);
        System.out.println("인자로 전달하는 r1의 값"+re);
        pt.testClassTypeParameter(re);
        
        App app = new App();
        app.testVariableLangthArrayParameter("이름","운동","책","여행");
    }

    public void testVariableLangthArrayParameter(String name,String...hobby){
        System.out.println("이름"+name);
        System.out.println("취미의 갯수"+hobby.length);
        System.out.println("취미 :");
        for(String hobbys:hobby){
            System.out.println(hobbys+" ");
        }
        System.out.println();
    }
}
