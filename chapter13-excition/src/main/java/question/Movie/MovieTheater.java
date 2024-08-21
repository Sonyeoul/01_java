package main.java.question.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheater {

    private static ArrayList<Movie> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Movie movie = new Movie();
    public void movieAdd(){
        System.out.println("총 몇편을 추가하시겠습니까?");
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < a ;i++){
        System.out.println("영화제목 :");
        String name = sc.nextLine();
        System.out.println("영화 시간 : ");
        String time = sc.nextLine();
        System.out.println("총 좌석 수 : ");
        int total = sc.nextInt();
        sc.nextLine();
        list.add(new Movie(name,time,total));
        }
    }

    public void movieinQuiry(){
        for(Movie  i: list){
            System.out.println(i);
        }
    }
    public void movieReserve() {
        System.out.println("어떤 영화를 예매하시겠습니까?");
        String movieName = sc.nextLine();
        for (Movie movie : list) {
            if (movie.getMovieTitle().equals(movieName)) {
                if (movie.getTotal() != 0) {
                    movie.setTotal(movie.getTotal() - 1);
                } else {
                    System.out.println("예약마감");
                }
            } else {
                System.out.println("영화 제목이 아닙니다");
            }
        }
    }
}
