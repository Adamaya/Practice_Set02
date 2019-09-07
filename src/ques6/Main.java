package ques6;
import ques6.Programming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pname=input.nextLine();
        Programming prog1=new Programming();
        Programming prog2=new Programming(pname);

    }
}
