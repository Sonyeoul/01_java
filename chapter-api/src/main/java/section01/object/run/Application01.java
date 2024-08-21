package main.java.section01.object.run;

import main.java.section01.object.book.Book;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 모든 클래스는 Object 클래스의 후손이다
        * 따라서 object 클래스가 가진 메소드를
        * 자신의 것 처럼 사용가능
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩해서
        * 사용하는것도 가능하다
        *
        * object 클래스의 메소드 중 관례상 많이 오버라이딩해서 사용하는 메소드가 있다
        * toString() equals() hashcode()
        *
        * */

        Book book1 = new Book(1,"태백산맥","김헝곤",50000);
        Book book2 = new Book(2,"아리랑","감",45000);
        Book book3 = new Book(2,"아리랑","감",45000);

        System.out.println("book3.toString() = " + book3);
        System.out.println("book2.toString() = " + book2);
        System.out.println("book1.toString() = " + book1);
    }
}
