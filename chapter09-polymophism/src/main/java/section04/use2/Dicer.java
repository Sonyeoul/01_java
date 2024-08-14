package main.java.section04.use2;

public class Dicer {

    private int currentPosition;

    public void move(int diceNum){
        this.currentPosition += diceNum;
    }
    public void throwDice(Dice dice){
        int diceNum = dice.getNumber();
        move(diceNum);
        System.out.println("현재 위치는 "+ currentPosition+"칸 입니다");
    }
}
