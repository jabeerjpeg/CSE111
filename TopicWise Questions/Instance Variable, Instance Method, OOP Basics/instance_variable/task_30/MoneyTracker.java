package instance_variable.task_30;

public class MoneyTracker {
    public String name;
    public double balance =0.0;
    public double add;
    public double spent;

    public void createTracker(String x){
        this.name=x;
        this.balance=1.0;

    }
    public void income(int n){
        System.out.println("Balance Updated!");
        this.balance +=n;
        this.add =0;
        this.add +=n;

    }
    public void expense(int n){

        this.balance -=n;
        if(this.balance==0){
            System.out.println("You're broke!");
            this.balance +=n;
        }
        else if ( this.balance <0){
            System.out.println("Not enough balance");
            this.balance+=n;

        }

        else{
            System.out.println("Balance Updated!");
            this.spent =0;
            this.spent +=n;
        }

    }
    public void showHistory(){
        System.out.println("Last added: "+this.add);
        System.out.println("Balance: "+this.spent);

    }
    public String info(){
        System.out.println("Name: " + this.name);
        System.out.print("Balance: " + this.balance);
        return "";

    }

}
