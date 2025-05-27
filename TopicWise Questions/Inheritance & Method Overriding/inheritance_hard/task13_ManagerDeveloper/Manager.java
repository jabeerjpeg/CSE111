package task13_ManagerDeveloper;

public class Manager extends Employee {
        public double bonus;
        public double finalSalary;

        public Manager(String name,
                       double baseSalary, int hoursWorked, double bonus){
            super(name, baseSalary,
                    hoursWorked);
            if(hoursWorked > 40) {
                this.bonus = bonus;
            }
        }

        public void requestIncrement(int amount)
        {
            if(super.getHoursWorked() > 80 && super.getHoursWorked() < 100)
            {
                double x= super.getBaseSalary() + amount/2;
                super.setBaseSalary(x);

                System.out.println("$" + amount/2 + " In" +
                        "crement appro" +
                        "ved.");
            }
            else if (super.getHoursWorked() > 100)
            {
                double y= super.getBaseSalary() + amount;


                super.setBaseSalary(y);
                System.out.println("$" + amount + " Inc" +
                        "rement approved.");
            }


            else
            {
                System.out.println("Incre" +
                        "ment de" +
                        "nied.");
            }
        }
        public void calculateSalary(){
            finalSalary = super.getBaseSalary() + (double)bonus/100 * super.getBaseSalary() ;
        }

        public void displayInfo()
        {

            super.displayInfo();
            System.out.println("Bon" +
                    "us: " + this.bonus +" %");
            System.out.println("Final Sala" +
                    "ry: $" + this.finalSalary);
        }

}
