package main.java.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class App3 {

    /*
    * LinkedList'
    * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고만되었다
    * 내부는 ㅣㅇ중연결 리스트로되어 ㅣㅇㅆ다.
    *
    * 이중연결 리스트
    * 단일연결 리스트는 다음 요소만 링크하는 반면
    * 이중연결 리스트는 이전 요소도 링크하여 이전 요소로 쉽게 접근하기 위해 고안된 자료 구조이다
    *
    * LinkedList는 이중연결 리스트를 구현한 것이며 역시 list를 상속받아 ArrayList 와 사용하는 방법이 거의 유사핟
    * 하지만 내부적으로 요소를 저장하는 방법에 차이가 있는것이다
    * 각 컬렉션 프레임워크 클래스들의 특징을 파악하고
    * 그에 떠ㅏ라 적합한주료구조를 구현란 클래스를 선택하는 것이 좋다
    *
    * */
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }

        list.remove(1);
        for (String s : list) {
            System.out.println(s);
        }

        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list);
        /*
        * ArrayList 장점
        * -내부적으로 배열을 사용하기 때문에 인덱스의 접근이 빠르다
        *  메모리 사용량이 적음
        *  -단점
        *  중간에 값을 추가하거나 삭제하는데 느린 성능을 가짐
        *  배열의 크기를 조절해야 할때 새로운 배열을 생성하고 기존요소를 복사한다.
        *  LinkedList 장점
        * 중간에 값을 추가하거나 삭제할때 빠르다
        * 고정된 크기의 배열이 필요하지않다
        * -단점
        * - 느린인덱스 접근의 속도
        * 더 복잡한 데이터 구조를 가짐
        * 더 많은 메모리 사용
        *
        * */

    }
}
