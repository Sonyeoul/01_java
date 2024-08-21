package main.java.section2;

//public class RabbitFarm<T extends Rabvit & Animal> &연산자 쓰면 인터페이스도 가능하다

public class RabbitFarm<T extends Rabvit & Animal>{
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
