package task10_SectionTester6;

public class Student extends Section {


    public Student (int id, String name, int sec_id, String teacher_name){
        student_count+=1;
        this.student_id = id;
        this.student_name = name;
        this.sec_id= sec_id;
        this.teacher_name= teacher_name;
    }



    public void printStudentInfo(){
        System.out.println("Student id: "+ this.student_id);
        System.out.println("Student name: "+ this.student_name);
        System.out.println("Section id: "+ this.sec_id);
        System.out.println("Teacher name: "+ this.teacher_name);
    }
}
