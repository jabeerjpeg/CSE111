package task10_SectionTester6;

public class Section {
    public static int student_count;
    public int student_id;
    public String student_name;
    public String teacher_name;
    public int sec_id;
    public static int section_count;


    public Section(){}

    public Section(String name) {
        section_count+=1;
        this.teacher_name = name;
        this.sec_id = section_count;
    }

}
