package main.java.section06.parameter;

public class Rect {

    private double width, height;

    public Rect() {
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void calcArea(){
        double area = (width * height);
        System.out.println("사각형의 넓이는 :"+area);
    }
  public void calcRound(){
        double round = (width+height)*2;
      System.out.println("사각형의 부피는 :"+round);
  }

  @Override
  public String toString(){
        return "사각형 가로는 "+width+"넓이는 "+height;
  }
}
