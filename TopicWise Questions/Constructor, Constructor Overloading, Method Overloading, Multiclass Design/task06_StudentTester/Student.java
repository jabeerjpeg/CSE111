package task06_StudentTester;

public class Student {
    public String name = "Not Set";
    public String dept = "CSE";
    public double cg = 0.0;
    public int credits = 9;
    public String scholarship = "Not Set";


    public Student() {

    }

    public void updateDetails(String name, double cg, int credits) {
        this.name = name;
        this.cg = cg;
        this.credits = credits;
        this.scholarship = "Not Set"; // Set default value
    }

    public void updateDetails(String name, double cg) {
        this.name = name;
        this.cg = cg;
        this.scholarship = "Not Set"; // Set default value
        if (this.cg < 3.5) {
            this.scholarship = "No Scholarship";
        }
    }

    public void updateDetails(String name, double cg, int credits, String dept)
    {
        this.name = name;
        this.cg = cg;
        this.credits = credits;
        this.dept = dept;
        this.scholarship = "Not Set";
    }

    public void checkScholarshipEligibility() {
        if (this.cg >= 3.5 && this.credits > 10)
        {

            if (this.cg >= 3.5 && this.cg < 3.7)
            {
                this.scholarship = "Need based scholarship";
                System.out.println(this.name + " is eligible for " + this.scholarship);
            }
            else if (this.cg >= 3.7)
            {
                this.scholarship = "Merit based scholarship";
                System.out.println(this.name + " is eligible for " + this.scholarship);
            }

        }

        else {
            this.scholarship = "No Scholarship";
            System.out.println(this.name + " is not eligible for a scholarship");
        }


    }

    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.dept);
        System.out.println("CGPA: " + this.cg);
        System.out.println("Credits: " + this.credits);
        System.out.println("Scholarship Status: " + this.scholarship);
    }
}
