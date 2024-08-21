package main.java.section01.object.run;

import main.java.section01.object.book.Book;

public class Application02 {
    /*
    * equals 메소드 오버라이딩
    * equlas 메소드는 매개변수로 전달 받은 인스턴스와 == 연산하여
    * true or false 로 반환한다
    *
    * 동일한 인스턴스인지 비교하는 기능을 한다
    *
    * 동일객체와 동동객체
    * 동일 객체는 주소가 동일한 인스턴스
    * 동동 객체는 주소는 다르더라도 필드값이 동일한 객체
    * */
    public static void main(String[] args) {


        Book book1 = new Book(1, "yaaa", "yooo", 1500);
        Book book2 = new Book(1, "yaaa", "yooo", 1500);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));
    }
}
