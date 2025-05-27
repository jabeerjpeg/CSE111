package task27_UsisTester;

public class Usis {
    public int totalAdvisee;
    public Student [] arr1 = new Student [5];


    public Usis(){
        System.out.println("Usis is ready to " +
                "use!");
    }

    public void login(Student name){
        if(name.email == null || name.password == null){
            System.out.println("Email and password need" +
                    " to be set.");
        }




        else{
            name.loginStatus = true;
            System.out.println("Login" +
                    " successful");
        }
        name.count=0;
    }





    public void advising(Student name){
        if(!name.loginStatus){
            System.out.println("Please login " +
                    "to advise courses!");
        }
        else{
            System.out.println("You haven't" +
                    " selected any courses.");
        }
    }


    public void advising(Student name, String c1, String c2, String c3, String c4){
        System.out.println("You need special" +
                " approval to take more than 3 courses");
    }




    public void advising(Student name, String c1, String c2, String c3)


    {
        name.course[0]=c1;
        name.course[1]=c2;
        name.course[2]=c3;
        name.count=3;
       arr1[totalAdvisee++]=name;
       System.out.println("Advising " +
               "successful");
    }



































    public void allAdviseeInfo() {
        System.out.println("Total Advi" +
                "see: " + this.totalAdvisee);
        for (int i = 0; i < this.totalAdvisee; i++) {
            System.out.println("Name: " + arr1[i].name + " ID: " + arr1[i].id);
            System.out.println("Department: " + arr1[i].department);
            System.out.print("Advised " +
                    "Courses: ");
            for (int j = 0; j < arr1[i].count; j++) {
                System.out.print(arr1[i].course[j] + " ");
            }
            System.out.println("\n==============");
        }
    }




}
