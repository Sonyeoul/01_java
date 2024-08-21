package main.java.section01.object.run;

import main.java.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application03 {

    /*
    * Object 클래스의 명세에 작성된 일반 규약에 따르면
    * sequls() 메소드를 재정의 하는 경우 반드시 hashcoid 도 재정의 하도록 되어있다
    * 만약 hashcode 를 재정의 하지 않으면 같은 값을 가지는 동등객체는 같은 해쉬코드값을
    * 가져야 한다는 규약을 위반하게 된다
    *
    * */


    public static void main(String[] args) {
        Book book1 = new Book(1,"yami","yoo",25000);
        Book book2 = new Book(1,"yami","yoo",25000);


        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        //hashcode를 재정의 하지 않았을때 문제점
        Map<Book,String> map = new HashMap<>();
        map.put(new Book(1,"yami","yoo",25000),"selled");
        String str = map.get(new Book(1,"yami","yoo",25000));

        System.out.println(str);
    }
}
