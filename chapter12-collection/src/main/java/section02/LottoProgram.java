//package main.java.section02;
//
//import java.util.*;
//
//public class LottoProgram {
//    public static void main(String[] args) {
//        final int MAX_NUMBER = 45;
//        final int LOTTO_SIZE = 6;
//        final int NUM_LOTTO_TICKETS = 10; // 10번 로또 판매
//
//        Random random = new Random();
//
//        // 당첨 번호 생성
//        Set<Integer> winningNumbers = new HashSet<>();
//        while (winningNumbers.size() < LOTTO_SIZE) {
//            winningNumbers.add(random.nextInt(MAX_NUMBER) + 1); // 1부터 MAX_NUMBER까지의 랜덤 숫자
//        }
//        System.out.println("당첨 번호: " + winningNumbers);
//
//        // 사용자 로또 번호 입력
//        Map<String, Set<Integer>> userLottoTickets = new HashMap<>();
//        for (int i = 1; i <= NUM_LOTTO_TICKETS; i++) {
//            Set<Integer> userNumbers = new HashSet<>();
//            while (userNumbers.size() < LOTTO_SIZE) {
//                userNumbers.add(random.nextInt(MAX_NUMBER) + 1); // 1부터 MAX_NUMBER까지의 랜덤 숫자
//            }
//            userLottoTickets.put(i + "번 로또", userNumbers);
//        }
//
//        // 당첨 확인
//        boolean hasWinner = false;
//        for (Map.Entry<String, Set<Integer>> entry : userLottoTickets.entrySet()) {
//            String ticketKey = entry.getKey();
//            Set<Integer> userNumbers = entry.getValue();
//            if (userNumbers.equals(winningNumbers)) {
//                System.out.println(ticketKey + " 당첨 : " + userNumbers);
//                hasWinner = true;
//            }
//        }
//
//        // 당첨자가 없는 경우
//        if (!hasWinner) {
//            System.out.println("행운 번호 : " + winningNumbers);
//            System.out.println("이번 회차 당첨 없음");
//        }
//    }
//}
//
