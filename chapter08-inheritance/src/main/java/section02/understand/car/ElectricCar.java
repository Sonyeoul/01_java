package main.java.section02.understand.car;

public class ElectricCar extends Car {

    private String energt;

    public ElectricCar(String brand, int price, String name, String energt) {
        super(brand, price, name);
        this.energt = energt;
    }

    public String getEnergt() {
        return energt;
    }

    public void setEnergt(String energt) {
        this.energt = energt;
    }

    @Override
    public double getPrice() {
        System.out.println("전기차 판매가는"+ super.getPrice()+"원 입니다");
        return super.getPrice()*0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar = carName = "+ super.getName()+"energt = "+energt;
    }
}
