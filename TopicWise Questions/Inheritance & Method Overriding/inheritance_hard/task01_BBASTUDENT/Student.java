package task01_BBASTUDENT;


public class Student{
    private String name = "Just" +
            " a " +
            "Student";
    private String department = "not" +
            "hing";

    public void updateDepartment(String dpt)
    {
        this.department = dpt;
    }
    public void updateName(String name)
    {
        this.name = name;
    }
    public void details()
    {
        System.out.println("Na" +
                "me : " + name + " Dep" +
                "artment: " + department);
    }
}

