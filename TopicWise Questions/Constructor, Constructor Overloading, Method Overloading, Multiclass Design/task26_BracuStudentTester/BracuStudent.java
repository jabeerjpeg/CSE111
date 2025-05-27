package task26_BracuStudentTester;

public class BracuStudent



{
        public String name;
        public String location ;
        public boolean busspass= false;

    public BracuStudent(String name, String location)




    {
            this.name = name;
            this.location = location;

    }
    public void showDetails()



    {
        System.out.println("Student Name: " + name);
        System.out.println("Live" +
                "s in " + location);
        System.out.println("Have " +
                "Bus pass? " + busspass);
    }




    public void getPass()


    {
        busspass = true;
    }




    public void updateHome(String home){
        this.location = home;
    }


}
