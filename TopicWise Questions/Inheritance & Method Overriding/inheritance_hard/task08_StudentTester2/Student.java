package task08_StudentTester2;

public class Student {
    public String name;
    public String dept;
    public int id;
    public static int count;
    public static int cse;
    public static int bba;

    public Student(String name, String dept){
        this.name = name;
        this.dept = dept;
        if(dept.equals("CSE")){
            cse++;
        }
        else if(dept.equals("BBA")){
            bba++;
        }
        count++;
        id=count;
        System.out.println("Creating Student Number: " + id );
    }

    public void individualInfo(){
        System.out.println(name + " is from " +  dept + " department");
        System.out.println("Serial of " + this.name + " among all students' is :" + count);
        if(dept.equals("CSE")) {
            System.out.println("Serial of " + this.name + " in CSE department is: " + cse);
        }
        else if(dept.equals("BBA")) {
            System.out.println("Serial of " + this.name + " in BBA department is: " + bba);

        }
    }

    public static void totalInfo(){
        System.out.println("Total Student: " + count);
        System.out.println("Total CSE Students: " + cse);
        System.out.println("Total BBA Students: " + bba);
    }
}


