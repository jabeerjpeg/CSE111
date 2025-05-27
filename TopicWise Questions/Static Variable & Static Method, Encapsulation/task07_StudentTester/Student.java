package task07_StudentTester;

public class Student {
    public static int total;
    public static int cse;
    public static int other;
    public String name;
    public double cg;
    public String dept;
    public static int id;


    public static void printDetails()
    {
        System.out.println("Total " +
                "Student(s): " + total);
        System.out.println("CSE " +
                "Student(s): " + cse);
        System.out.println("Other" +
                " Department Student(s): " + other);
    }

    public Student(String name, double cg)
    {
        this.name = name;
        this.cg = cg;
        this.dept= "CSE";
        id++;
        Student.cse+=1;
        Student.total+=1;

    }

    public Student(String name,
                   double cg,
                   String dept)
    {
        this.name= name;
        this.cg= cg;

        this.dept= dept;

        if(dept.equals("CSE"))
        {
            Student.cse+=1;
            Student.total +=1;
        }

        else
        {
            Student.other+=1;
            Student.total +=1;

        }
        id++;


    }


    public void individualDetail()
    {
        System.out.println("ID: "
                + id);

        System.out.println("Name: " +
                "" + name);

        System.out.println("CGPA: "
                + cg);
        System.out.println("Department: "
                + dept);


    }



}
