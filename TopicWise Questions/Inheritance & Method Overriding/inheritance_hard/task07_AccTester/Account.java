package task07_AccTester;

public class Account {
        public static int count;
        public String name;
        public int age;
        public String occupation;
        public int balance;

        public Account(String name, int age, String occupation, int balance) {
            this.name = name;
            this.age = age;
            this.occupation = occupation;
            this.balance = balance;
            count++;
        }

        public void addMoney(int amount) {
            balance += amount;
        }

        public void withdrawMoney(int amount) {
            balance -= amount;
            if(balance < 0) {
                balance += amount;
                System.out.println("Insufficient money for withdrawl!");
            }
        }

        public void printDetails(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Occupation: " + occupation);
            System.out.println("Total Amount: " + balance);
        }

}
