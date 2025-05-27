package task01_BBASTUDENT;

public class BBAStudent extends Student{

    public BBAStudent() {
        updateDepartment("BB" +
                "A");
        updateName("Def" +
                "ault");
    }
    public BBAStudent(String name)
    {
        updateName(name);
        updateDepartment("B" +
                "BA");
    }
}



