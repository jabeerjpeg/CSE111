package task13_ManagerDeveloper;

public class Developer extends Employee {
    public String lang;
    public double finalSalary;
        public Developer(String name,
                         double baseSalary,
                         int hoursWorked,
                         String lang) {
            super(name, baseSalary,
                    hoursWorked);
            this.lang = lang;

        }

    public void calculateSalary()
    {
            finalSalary= getBaseSalary();

            if(lang.equals("Ja" +
                    "va")) {

                finalSalary += 700;
            }

    }

    public void displayInfo()

    {
            super.displayInfo();
            System.out.println("Langua" +
                    "ge: " + lang);
            System.out.println("Final " +
                    "Salary: $" + finalSalary);
    }

}
