package ques5;

import ques5.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle(4.0,4.0);
        Rectangle rect3=new Rectangle(4.0);
        System.out.println(rect1.area());
        System.out.println(rect2.area());
        System.out.println(rect3.area());
    }
}
