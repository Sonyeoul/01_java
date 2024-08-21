package main.java.section01.list.run;

import main.java.section01.list.comparator.AscendingPrice;
import main.java.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        List<BookDTO> books = new ArrayList<>();

        books.add(new BookDTO("홍길동전",1,"허균",20000));
        books.add(new BookDTO("야전",2,"정약용",10000));
        books.add(new BookDTO("굴전",3,"허준",15000));
        books.add(new BookDTO("심잔",4,"야규",30000));
        books.add(new BookDTO("유사",5,"오무",50000));



        //Collections.sort(books);
    /*
    * Comparator 인터페이스를 상속받아 정렬의 기준을 정해줌
    * list의 sort 메소드의 인자로 정렬 기준이 되는 인스턴스를 넣어주면
    * 우리가 오버라이딩 한 메소드가 동작하게 되며 그것을 정렬 기준으로 삼는다.
    *
    *  */
        System.out.println("가격 오름차순");
        books.sort(new AscendingPrice());
        for(BookDTO book : books) {
            System.out.println(book);
        }
        System.out.println("---책제목 기죽 오름차순---");
        books.sort(new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for(BookDTO book : books) {
            System.out.println(book);
        }
        System.out.println("---저자순----");
        books.sort(new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for(BookDTO book : books) {
            System.out.println(book);
        }

        System.out.println("---저자내림차순----");
        books.sort(new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        for(BookDTO book : books) {
            System.out.println(book);
        }
    }
}
