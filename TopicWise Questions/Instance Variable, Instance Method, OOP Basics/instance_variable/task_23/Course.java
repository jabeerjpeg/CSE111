package instance_variable.task_23;

public class Course {
    public String name;
    public String code;
    public String [] syll= new String [4];
    public int num;


    public void createCourse(String x, String y){
        this.name=x;
        this.code=y;

    }
    public void printDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name: "+ this.name);
        System.out.println("Course Code: "+ this.code);
        System.out.println("Course Syllabus: ");
        if(num>0) {
            for (int i = 0; i < num-1; i++) {

                System.out.print(this.syll[i] +", ");
            }
            System.out.println(this.syll[num-1]);
        }

        else{
            System.out.println("No Content yet");
        }
    }
    public void addOneContent(String x){
        if(num <4) {
            this.syll[this.num++] = x;
            System.out.println(x+" was added.");

        }
        else{
            System.out.println("Cannot add more content");
        }
    }
    public void addTwoContent(String x, String y){
        if(num <4) {
            this.syll[this.num++] = x;
            System.out.println(x+" was added.");
        }
        else{
            System.out.println("Cannot add more content");
        }
        if(num <4) {
            this.syll[this.num++] = y;
            System.out.println(y+" was added.");

        }
        else{
            System.out.println("Cannot add more content");
        }

    }
}
