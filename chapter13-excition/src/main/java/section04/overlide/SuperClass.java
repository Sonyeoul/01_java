package main.java.section04.overlide;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class SuperClass {

    public void metho() throws IOException {

    }

    //부모의 예외보다 상위의 예외는 불가 thriws Exception 불가
    public abstract void method() throws FileNotFoundException;
}
