package main.java.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;

    public void SetHp(int hp) {

        if(hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을"+"입력한 값으로 변경합니다");
            this.hp = hp;

            /*
            * this 는 인스턴스가 생성되었을때 자신의 주소를 저장하는 래퍼런스 변수
            * 지역변수와 전역변수의 이름이 동일한 경우
            * 지역변수를 우선적으로 접근하기 때문에 전역변수에 접근하기 위해서
            * this. 값을 명시한다.
            * */
        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다");
            this.hp = 0;
        }
    }


}
