package instance_variable.task_16;

public class Employee {
    public String name;
    public double salary;
    public String designation;

    public void newEmployee(String nm)
    {
        this.name = nm;
        this.salary = 30000.0;
        this.designation = "junior";
    }

    public void displayInfo()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }

    public void calculateTax() {
        double tax =0.0;
        if (salary > 50000) {
            tax= salary* 0.3;
            System.out.printf(name + " Tax Amount: %.2f Tk\n", tax);
        }
        else if ( salary > 30000 && salary < 50000) {
             tax = salary * 0.1;
            System.out.printf(name + " Tax Amount: %.2f Tk\n", tax);
        }
        else if (salary <=30000){
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String newDesig) {
        this.designation = newDesig;

        if (newDesig.equals("lead")) {
            this.salary += 50000.0;
            System.out.println(name + " has been promoted to lead");
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }

        else if (newDesig.equals("manager"))
        {
            this.salary += 75000.0;
            System.out.println(name + " has been promoted to manager");
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }
        else if (newDesig.equals("senior")){
            this.salary += 25000.0;
            System.out.println(name + " has been promoted to manager");
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }
    }

}

