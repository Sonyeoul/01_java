package main.java.section01.list.dto;

public class BookDTO {

    private String title;
    private int num;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(String title, int num, String author, int price) {
        this.title = title;
        this.num = num;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
