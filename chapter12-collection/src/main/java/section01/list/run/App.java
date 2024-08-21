package main.java.section01.list.run;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임워크
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리가능
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다
        * 즉 데이터를 효율적으로 저장하는 주료구조와 데이터를 처리하는 알고리즘을
        * 미리 구현해놓은 클래스를 말한다
        *
        * Collection은 크게 3가지 인터페이스 중 한가지 를 상속받ㅇ ㅏ구현한다
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인토페이스
        *
        *  List인터페이스는 set 인터페이스의 공통부분을 collection인터페이스에서 정의하고있다
        *  Map은 구조상의 차이로 정의하고 있지않음
        *
        * 1. List
        *  순서있는 데이터의 집합으로 데이터의 중복 저장을 허용함
        * = Vector, ArrayList .LinkedList, stack. Queue 등이 있다
        * 2. set
        *  순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않음
        * = Hashset TreeSet 등이 있다
        * 3. Map
        * = 키와 값 한쌍으로 이루어지는 데이터의 집합이다
        * key를 set 방식으로 관리하기 때문ㅇ ㅔ 데이터 순서르 관리하지 않고 중복된 key를 허용하지않음
        * HashMap, Treemap, hashtable,properties 등이 있다
        *
        *
        * ArrayList
        * - 가자 많이 사용되는컬렉션 클래스다
        * 내부적으로 배열을 이용하여 요소를 관리하며 인덱를 이용해 배열 요소에 빠르게 접근가능
        *
        * ArrayList는 배열의 단점을 보환하기 위해 만들어졌다 배열은 크기를 변경할수없고
        * 요소의 추가 삭제 정렬이복잡하다는 단점을 가지고있다
        * 하지만 이런 단점을 보완하고자
        * 크기변경 요소추가 삭제 정렬 기능을 미리 메소드로 구현해서 제공하고있다
        * 자동적으로 수행되는 것이지 속도가 빨라지는것은 아니다
        *
        * */

        ArrayList al = new ArrayList();
        List l = new ArrayList();

        Collection cl = new ArrayList();

        l.add("app");
        l.add(123);
        l.add(45.2);
        l.add(new Date());

        System.out.println(l);

        System.out.println(l.size());
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i));
        }
// 원하는 인덱스 위치에 값을 추가할수있다
        l.add(1,"bba");
        System.out.println(l);

        //set() 지정된 위치의 값 수정
        l.set(1,"melon");
        System.out.println(l);
        //모든 컬렉션 프레임워크는 제네릭 클래스로 되어있다
        List<String> StringList = new ArrayList<>();
        StringList.add("app"); //원하는 자료형으로 입력만 가능하게 바꿀수있다
        StringList.add("naa");
        StringList.add("yolo");
        //StringList.add(123456);
        System.out.println(StringList);

        
        //collections은 collection에서 사용되는 기능들을 메소드를 구현해놓은 클래스
        Collections.sort(StringList);
        System.out.println(StringList);
    }
}
