package main.java.section02;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        /*
        * hashset이 가지는 기능을 모두 가지고있고
        * 추가적으로 저장 순서를 유지하는 특징을가지고 있다
        * 인덱스 접근 불가
        * */

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("java");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        set.add("java4");
        set.add("java5");
        System.out.println(set);

    }
}
