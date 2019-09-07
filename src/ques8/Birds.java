package ques8;

public class Birds extends Animal {
    public void fly() {
        System.out.println("Birds flies in the sky");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat insects");
    }

    @Override
    public void sleep() {
        System.out.println("birds do not sleep");
    }

}
