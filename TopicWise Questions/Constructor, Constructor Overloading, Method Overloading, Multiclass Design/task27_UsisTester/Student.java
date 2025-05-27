package task27_UsisTester;

public class Student






{
    public String name;
    public int id;
    public String [] course= new String [3];
    public String email;
    public String password;
    public boolean loginStatus= false ;
    public String department;
    public int count;

    public Student(String name, int id, String dept)







    {
        this.name = name;
        this.id = id;
        this.department = dept;
        System.out.println("Student object is c" +
                "reated");
    }

}
