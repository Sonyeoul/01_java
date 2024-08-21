package main.java.question.store;

public class Product {

    private String pname;
    private int price;
    private int stock;

    public Product() {
    }

    public Product(String pname, int price, int stock) {
        this.pname = pname;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + pname + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
