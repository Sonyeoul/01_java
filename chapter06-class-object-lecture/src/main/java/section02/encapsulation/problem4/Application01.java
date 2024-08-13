package main.java.section02.encapsulation.problem4;

public class Application01 {

    public static void main(String[] args) {

        Monster monster = new Monster();

        monster.setkind("드라큘라");
        monster.setHp(100);
        //String s =monster.getinfo();
        System.out.println(monster.getinfo());


    }
}
