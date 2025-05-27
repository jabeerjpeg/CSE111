package instance_variable.task_01;

public class UniversityTester {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.name);
        System.out.println(u2.name);
        System.out.println(u1.country);
        System.out.println(u2.country);
        //no the location are not the same
        u1.name = "Imperial College London";
        u1.country = "England";
        System.out.println("name = \"" + u1.name + "\"");
        System.out.println("country = \"" + u1.country + "\"");
        u2.name = "Brac University";
        u2.country = "Bangladesh";
        System.out.println("name = \"" + u2.name + "\"");
        System.out.println("country = \"" + u2.country + "\"");

    }
}
