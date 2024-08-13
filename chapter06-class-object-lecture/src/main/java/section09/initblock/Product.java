package main.java.section09.initblock;

public class Product {

    //1. 명시적 초기화

    private String name="겔럭시";
    private int price=10000;
    private static String brand = "삼성";

    {
        name ="아이폰";
        price=100000;
        brand ="애플";
        System.out.println("인스턴스 초기화 블록 동착함");
    }

    static {
        brand = "엘지";

    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand +
                '}';
    }

    public Product() {
    }

    public Product(String name, int price,String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨");
    }
}
