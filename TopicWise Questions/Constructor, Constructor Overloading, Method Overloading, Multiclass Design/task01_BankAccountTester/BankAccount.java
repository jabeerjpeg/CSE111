package task01_BankAccountTester;

public class BankAccount {
    public int acc;
    public String Type= "Not Set";


    public String printDetails() {
        return "Account No: " +this.acc+ "\nType: " +this.Type;
    }
    public void setInfo(int a, String b) {
        this.acc = a;
        this.Type = b;
        System.out.println("Account information updated! ");
    }

}
