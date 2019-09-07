package ques5;

public class Rectangle {
    private double length;
    private double breadth;

    public double getBreadth() {
        return breadth;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public Rectangle(){
        setBreadth(0.0);
        setLength(0.0);
    }
    public Rectangle(double length,double breadth){
        setBreadth(breadth);
        setLength(length);
    }
    public Rectangle(double breadth){
        setBreadth(breadth);
        setLength(0.0);
    }
    public double area(){
        return this.length*this.breadth;
    }
}
