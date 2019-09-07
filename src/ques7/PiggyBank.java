package ques7;

public class PiggyBank {
    private double amount;
    public double getAmount(){
        return amount;
    }
    protected final void takeMoney(double money){
        amount+=money;
    }
    protected final void addMoney(double money){
        amount-=money;
    }

    PiggyBank() {
        System.out.println("Acces denied");
    }
}
