package task09_StudentTester5;

public class Tester5 {
    public static void main(String[] args) {
        Student s1= new Student(1, "Matthew", 1, "Mr. XYZ");
        s1.printStudentInfo();
        System.out.println("=======================");
        Student s2= new Student(2, "Wade", 1, "Mr. XYZ");
        s2.printStudentInfo();
        System.out.println("=======================");
        Student s3= new Student(1, "Logan", 2, "Mr. ABC");
        s3.printStudentInfo();
    }
}
