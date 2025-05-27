package task20_StudentDriver;

public class Student {
    private int id;
    private double cg;
    private String [] arr1;
    private int count;

    public Student() {
    }




    public Student(int id) {
        this.id = id;
    }

    public Student(int id, double cg){
        this.id = id;
        this.cg = cg;
        setCG(cg);
    }



    public void setID(int id) {
        this.id = id;
    }

    public void rmAllCourse(){
        if(arr1!=null) {
            for(int i=0;i<arr1.length;i++){
                arr1[i]=null;
            }
            count=0;
        }
    }

    public void addCourse(String [] c){
        for(int i=0;i<c.length;i++){
            addCourse(c[i]);
        }
    }

    public void addCourse(String c) {
        if(this.cg ==0.0){
            System.out.println("Failed to add " + c +"\nSet CG first");
        }
        else if(this.cg <3 && (count==3)){
            System.out.println("Failed to add "+ c+ "\nCG is low. Can't add more than 3 courses");
        }
        else if(this.cg > 3 && (count==4)){
            System.out.println("Failed to add "+ c+"\nMaximum 4 courses allowed.");
        }
        else {
            this.arr1[count] = c;
            count++;
        }
    }

    public void setCG(double cg) {
        this.cg = cg;
        if(cg<3){
            arr1= new String[3];
        }
        else if(cg>3 && cg<4){
            arr1= new String[4];
        }
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + this.id +", CGPA: " +this.cg);
        if(arr1[0]== null) {
            System.out.println("No courses added.");
        }
        else {
            System.out.println("Added courses are: ");
            for(int i=0; i<count; i++) {
                System.out.print(arr1[i]+ " ");
            }
            System.out.println();
        }
    }
}
