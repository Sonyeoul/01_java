package main.java.section02.encapsulation.problem3;

public class Application01 {


    public static void main(String[] args) {
        //필드에 직접 접근시 생기는 문제점

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);


        Monster monster2 = new Monster();
        monster2.setInfo("트롤");
        monster2.setHp(100);


        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());

        Monster monster3 = new Monster();
        monster3.kind="또치";
        monster3.hp=100;
        //그냥 셋겟을 만들었지만 필드접근도 가능하다

    }
}
