package ques1;

import ques2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Aman");
        student.setRoll_no(101);
        System.out.println(student.getName());
        System.out.println(student.getRoll_no());
        Rectangle rec=new Rectangle(4.0,5.0);
        rec.calculateArea();


    }
}
