package task07_StudentTesterCSE;

public class CSEStudent extends Student{
    public static int count;
    public static String[] arr1 = {"CSE110",
            "CSE111" , "CSE220" ,
            "CSE221"};
    public String [] arr2= new String[arr1.length];
    public int c;




    public CSEStudent(String name,
                      int id){
        super(name, id);
        count++;
    }



    public static void details(){
        System.out.println("Total CSE" +
                " Students: " + CSEStudent.count) ;
        System.out.println("Available" +
                " Lab Based Courses: ") ;
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
    }


    public void info(){
        System.out.println("Na" +
                "me: " + super.name);
        System.out.println("ID" +
                ": " + super.id);
        System.out.print("Cour" +
                "ses: ");


        if(c >0)
        {
            for(int i=0; i<c; i++)
            {
                System.out.print(arr2[i]+ " ");
            }
        }
        System.out.println();

    }

    public void addLabBasedCourse(String course){
        boolean found= false;
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i].equals(course)){
                arr2[c]=course;
                c++;
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("It is not a lab based course!");
        }



    }
}
