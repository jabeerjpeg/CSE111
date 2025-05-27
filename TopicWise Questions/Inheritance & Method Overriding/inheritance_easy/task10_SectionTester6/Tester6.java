package task10_SectionTester6;

public class Tester6 {
    public static void main(String[] args) {
        Section sec1= new Section("Mr. XYZ");
        Section sec2= new Section("Mr. ABC");
        System.out.println("Number of Sections: "+ Section.section_count);
        System.out.println("=======================");
        Student s1= new Student(1, "Matthew", sec1.sec_id,
                sec1.teacher_name);
        s1.printStudentInfo();
        System.out.println("=======================");
        Student s2= new Student(2, "Wade", sec1.sec_id,
                sec1.teacher_name);
        s2.printStudentInfo();
        System.out.println("=======================");
        Student s3= new Student(1, "Logan", sec2.sec_id,
                sec2.teacher_name);
        s3.printStudentInfo();
        System.out.println("=======================");
        System.out.println("Number of Students: "+ Student.student_count);
    }
}
