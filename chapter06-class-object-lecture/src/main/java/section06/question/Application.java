package main.java.section06.question;

public class Application {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO();
        BookDTO book2 = new BookDTO("자바의 정석","도우출판","남궁성");
        BookDTO book3 = new BookDTO("홍길동전","활빈당","허균",500000,0.5);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
