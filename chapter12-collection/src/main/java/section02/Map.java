package main.java.section02;

import java.util.*;

public class Map {
    public static void main(String[] args) {

    }/*
         * map
         * Collection 인터페이스와는 다른 저장 방식을 가짐
         * 키와 값을 한쌍으로 저장하는 방식을 사용
         * 인덱스 대신에 키 사용
         *
         * key?
         * 값을 갖기 위한 이름 역할을 하는 객체를 의미
         * 1. 요소의 저장 순서를 유지하지않음
         * 2. 키는 중복값을 허용하지 않지만 키가 다르면 중복값은 저장가능
         *
         * hashmap, hashtable, treemap 등 대표적인 클래스가 있지만
         * HashMap이 가장 많이 사용된다
         *
         * */

//        HashMap hmap = new HashMap();
//        hmap.put("A", new Date());
//        hmap.put(1,"야미");
//        hmap.put(3.3,"루루");
//        hmap.put("four","KAF");
//        System.out.println(hmap);
//        hmap.put(1,"ye");
//        System.out.println(hmap);
//
//        System.out.println(hmap.get(1));
//        hmap.remove(1);
//
//        HashMap<String , Integer> hmap2 = new HashMap<>();
//
//        hmap2.put("one",21);
//        hmap2.put("two",52);
//        hmap2.put("three",32);
//        hmap2.put("four",22);
//        hmap2.put("five",12);
//
//        //keyset 을 이용해서 키만 따로 set으로 만들고 iterator()로
//        //키에 대한 목록을 만든다.
//        Iterator<String> keyIter = hmap2.keySet().iterator();
//        while (keyIter.hasNext()) {
//            String key = keyIter.next();
//            String value = hmap2.get(key);
//            System.out.println(key+" + "+value);
//        }
//        Collection<String> values = hmap2.values();
//
//        Iterator<String> valueIter = values.iterator();
//        while (valueIter.hasNext()) {
//            System.out.println(valueIter.next());
//        }
//        Object[] valueArr = values.toArray();
//        for (int i = 0; i < valueArr.length; i++) {
//            System.out.println(valueArr[i]);
//        }
//
//        //Map의 내부에 존재하는 EntrySet 을 이용
//
//
//    }
//}
    }