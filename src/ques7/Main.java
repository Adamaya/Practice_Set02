package ques7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        if (money > 0) {
            PiggyBank piggy = new PiggyBank(money);
        } else {
            PiggyBank piggy = new PiggyBank();
        }
    }
}
