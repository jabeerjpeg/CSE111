package task12_MoneyTrackerTester;

public class MoneyTracker {
    public String name;
    public double balance;
    public int lastadd;
    public int lastspent;


    public String info() {
        return "Name: " + this.name + "\nCurrent Balance: " + this.balance;
    }
    public void createTracker(String name) {
        this.balance =1.0;
        this.name = name;

    }
    public void income(int n){
        this.balance += n;
        System.out.println("Balance Updated!");
        lastadd = n;
    }
    public void expense(int n){
        this.balance -= n;
        if(this.balance == 0){
            System.out.println("You're broke!");
            this.balance +=n;
        }
        else if(this.balance < 0){
            System.out.println("Not enough balance.");
            this.balance += n;
        }
        else {
            System.out.println("Balance Updated!");
            lastspent = n;
        }
    }

    public void showHistory() {
        System.out.println("Last added: " + lastadd);
        System.out.println("Last spent: " + lastspent);

    }
}


