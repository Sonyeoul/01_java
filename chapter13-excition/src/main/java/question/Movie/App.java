package main.java.question.Movie;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie movie = new Movie();
        MovieTheater mTheater = new MovieTheater();

        while (true) {
            System.out.println("1. 영화 추가 2.영화목록보기 3.상영중인 영화 예매하기");
            int number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    mTheater.movieAdd();
                    break; //영화추가
                case 2:
                    mTheater.movieinQuiry();
                    break; //영화 목록 보기
                case 3:
                    mTheater.movieReserve(); //상영중인 영화 예매하기
                    break;
                    case 4: return;
                default:
                    System.out.println("다른 숫자입력");
            }
        }

    }
}
