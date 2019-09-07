package ques7;

public class PiggyBank {
    private double amount;
    public double getAmount(){
        return amount;
    }

    PiggyBank(double money) {
        addMoney(money);
        getAmount();
    }

    protected final void takeMoney(double money){
        amount -= money;
    }

    PiggyBank() {
        System.out.println("Access denied");
    }

    protected final void addMoney(double money) {
        amount += money;
    }
}
