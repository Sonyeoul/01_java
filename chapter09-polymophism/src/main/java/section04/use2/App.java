package main.java.section04.use2;

public class App {

    public static void main(String[] args) {

        Dicer dicer = new Dicer();

        dicer.throwDice(new SuperDice());
        dicer.throwDice(new HellDice());
    }
}
