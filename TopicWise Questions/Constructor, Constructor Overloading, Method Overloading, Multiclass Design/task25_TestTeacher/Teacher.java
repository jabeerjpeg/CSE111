package task25_TestTeacher;

public class Teacher {
    public String name;
    public String ini;
    public String [] arr1= new String[3];
    public int count;

    public Teacher(String name, String initials)

    {
        this.name = name;
        this.ini = initials;
        System.out.println("A new teacher has been created");
    }




    public void addCourse(Course course)
    {
        this.arr1[count] = course.courseName;
        count++;
    }





    public void printDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Initials: " + this.ini);
        System.out.println("List of courses: ") ;
        for (int i = 0; i < count; i++) {
            System.out.println(arr1[i]);
        }
    }
}
