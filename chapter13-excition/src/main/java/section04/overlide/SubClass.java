package main.java.section04.overlide;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
//
//    @Override
//    public void method(){}


    //부모의 예외보다 상위의 예외는 불가 thriws Exception 불가
    @Override
    public void method() throws FileNotFoundException {

    }
}
