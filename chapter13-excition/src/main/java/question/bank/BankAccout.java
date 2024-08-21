package main.java.question.bank;

public class BankAccout {
    private String num;
    private String name;
    private int money;

    public BankAccout() {
    }

    public BankAccout(String num, String name, int money) {
        this.num = num;
        this.name = name;
        this.money = money;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "BankAccout{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
