package task09_StudentTester5;




public class Section {
    public int sec_id;
    public String teacher_name;
    public int student_id;
    public String student_name;


    public Section(int id, String name){
        this.sec_id = id;
        this.teacher_name = name;
    }


    public void printInfo(){
        System.out.println("Section id: "+ this.sec_id);
        System.out.println("Teacher name: "+ this.teacher_name);
    }


}
