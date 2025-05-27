package task23_StudentDriverTester;

public class Student {
    public int id;
    public double cg;
    public String[] arr1;
    public int count;
    public boolean ok;


    public void showAdvisee()
    {
        System.out.println("Student ID: " + this.id + ", CGPA: " + this.cg);
        System.out.println("Added courses are: ");



        if (this.count > 0 && this.arr1 != null) {
            for (int i = 0; i < count; i++) {
                System.out.print(arr1[i] + " ");

            }



            System.out.println();
        }
        else{
            System.out.println("No courses added");
        }
    }



    public Student(int id)
    {
        this.id = id;
            System.out.println("A student with ID " + id + " has been created.");
    }


    public Student(int id, double cg)
    {
        this.id = id;
        this.cg = cg;
        System.out.println("A student with ID " +
                id + " and cgpa "+ cg+" has been created.");
        storeCG(cg);

    }


    public void storeCG(double cg) {
        this.cg = cg;
        if(cg>3) {
            this.arr1 = new String[4];
        }
        else {
            this.arr1 = new String[3];
        }
        this.count=0;
    }




    public void addCourse(String course)


    {
        if (this.arr1 == null)
        {
            System.out.println("Failed to" +
                    " add " + course);
            System.out.println("Set CG first.");
        } else if (this.cg <= 0)
        {
            System.out.println("Failed " +
                    "to add " + course);
            System.out.println("Set CG first.");
        }



        else if (this.cg < 3)
        {
            if (count < 3) {
                arr1[count] = course;
                count++;
            }



            else {
                System.out.println("Failed to add " + course);
                System.out.println("CG is low." +
                        " Can't add more than 3 courses.");
            }
        } else if (this.cg >= 3 && this.cg <= 4)
        {
            if (count < 4)
            {
                arr1[count] = course;
                count++;
            }


            else
            {
                System.out.println("Failed to add " + course);
                System.out.println("Maximum 4 " +
                        "courses allowed.");
            }
        }

    }


    public void addCourse(String [] courses) {
        for (int i = 0; i < courses.length; i++) {
            addCourse(courses[i]);
        }


    }


    public void removeAllCourse()

    {
        if (this.arr1 != null) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = null;
            }
        }
        this.count = 0;
    }

    public void storeID(int id)



    {
        this.id = id;
    }


}



