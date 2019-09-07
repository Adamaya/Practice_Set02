package ques2;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        setBreadth(breadth);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println(this.length * this.breadth);
    }

}
