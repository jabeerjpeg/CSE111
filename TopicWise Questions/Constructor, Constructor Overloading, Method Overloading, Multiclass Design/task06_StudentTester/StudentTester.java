package task06_StudentTester;

public class StudentTester{
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.showDetails();
        System.out.println("1------");
        std1.updateDetails("Alif", 3.99, 12);
        System.out.println("2----");
        std1.checkScholarshipEligibility();
        System.out.println("-----");
        std1.showDetails();
        Student std2 = new Student();
        std2.updateDetails("Mim", 3.4);
        Student std3 = new Student();
        std3.updateDetails("Henry", 3.5, 15, "BBA");
        System.out.println("------");
        std2.checkScholarshipEligibility();
        System.out.println("------");
        std3.checkScholarshipEligibility();
        System.out.println("7-------");
        std2.showDetails();
        System.out.println("-----");
        std3.showDetails();
    }
}