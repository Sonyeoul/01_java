package main.java.section02.encapsulation.problem4;

public class Monster {

    /*
    * 접근제어자
    *
    * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기위함
    * 1. public 모든 패키지
    * 2. protected : 동일 패키지에 접근 허용 상속관계에서
    * 3.default : 동일 패키지에서만 접근가능
    * 4. private : 해당클래서 내부에서만 접근허용
    *
    * 위에 네가지 접근제어자는 클래스의 멤버 모두 사용가능하다
    * 단, 클래스 선언 시 사용하는 접근제어자는 publick과 default만 가능하다
    *
    * */
    private String kind;
    private int hp;

    public void setkind(String kind) {
        this.kind = kind;
    }

    public void setHp(int hp) {
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
    public String getinfo(){
        return "몬스터의 종류는"+kind+"이고 체력은" + hp + "이다";
    }
}
