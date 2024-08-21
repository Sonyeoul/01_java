package main.java.section02;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Random random= new Random();
        Set<Integer> lottoNum = new HashSet<>();

        System.out.println("당첨 번호");
        while (lottoNum.size() < 6) {
            lottoNum.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(lottoNum);
        System.out.println();

        List<Set<Integer>> lottoList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Set<Integer> userNum = new HashSet<>();
            while(userNum.size() < 6) {
                userNum.add((int) (Math.random() * 45) + 1);
            }
            lottoList.add(userNum);
            System.out.println(userNum);
        }

        boolean lucky = false;
        for(int i = 0; i < lottoList.size(); i++) {
        Set<Integer> userNum = lottoList.get(i);
        if(userNum.equals(lottoNum)) {
            System.out.println((i+1)+"번째 당첨");
        lucky = true;
        }
        }
        if(!lucky){
            System.out.println("당첨자없음");
        }
    }
}

