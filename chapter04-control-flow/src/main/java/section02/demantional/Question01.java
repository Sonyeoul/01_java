package main.java.section02.demantional;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        Question01 q = new Question01();
        q.baduk();





    }
    public void baduk(){
        int[][] baduk = new int[11][11];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < baduk.length; i++) {
            System.out.println();
            for (int j = 0; j < baduk.length; j++) {
                baduk[i][j] = 0;
                System.out.print(baduk[i][j] + " ");
            }
        }

        while(true) {
            System.out.println();
            System.out.println("흑돌 바둑판 X좌표 :");
            int blX = in.nextInt();
            System.out.println("흑돌 바둑판 Y좌표 :");
            int blY = in.nextInt();
            for (int i = 0; i < baduk.length; i++) {
                System.out.println();
                for (int j = 0; j < baduk.length; j++) {
                    if (baduk[i][j] != 2) {
                        baduk[blX][blY] = 1;
                        System.out.print(baduk[i][j] + " ");
                    }
                }
            }
            System.out.println();
            System.out.println("흰돌 바둑판 X좌표 :");
            int wlX = in.nextInt();
            System.out.println("흰돌 바둑판 Y좌표 :");
            int wlY = in.nextInt();
            for (int i = 0; i < baduk.length; i++) {
                System.out.println();
                for (int j = 0; j < baduk.length; j++) {
                    if(baduk[i][j]  != 1) {
                        baduk[wlX][wlY] = 2;
                        System.out.print(baduk[i][j] + " ");
                    }
                }
            }
        }
    }
}
