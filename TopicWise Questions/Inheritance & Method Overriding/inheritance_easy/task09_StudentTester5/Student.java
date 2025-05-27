package task09_StudentTester5;

public class Student extends Section {

    public Student(int id, String name, int id2 , String name2) {
        super(id2, name2 );
        super.student_id = id;
        super.student_name = name;

    }

    public void printStudentInfo() {
        System.out.println("Student ID: " + super.student_id);
        System.out.println("Student name: " + super.student_name);
        super.printInfo();
    }





}
