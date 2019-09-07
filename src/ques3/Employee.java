package ques3;

public class Employee {
    private String name;
    private double salary;
    private double numberOfHourWorked;

    public double getNumberOfHourWorked() {
        return numberOfHourWorked;
    }

    public void setNumberOfHourWorked(double numberOfHourWorked) {
        this.numberOfHourWorked = numberOfHourWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee(String name){
        setName(name);
    }

}
