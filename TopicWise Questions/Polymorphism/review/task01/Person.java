package task01;

public class Person {
    private String name;
    private int age;
    private String type;
    private Vaccine vaccine;
    private boolean dose1;
    private boolean dose2;

    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.dose1 = false;
        this.dose2 = false;
        this.vaccine = null;
    }

    public Person(String name, int age) {
        this(name, age, "General Citizen");
    }

    public void pushVaccine(Vaccine v) {
        if (!type.equals("Student") && age < 25) {
            System.out.println("Sorry " + name + ", Minimum age for taking vaccines is 25 years now.");
        } else if (vaccine == null) {
            vaccine = v;
            dose1 = true;
            System.out.println("1st dose done for " + name);
        } else if (!vaccine.getName().equals(v.getName())) {
            System.out.println("Sorry " + name + ", you can’t take 2 different vaccines");
        } else if (dose1 && !dose2) {
            dose2 = true;
            System.out.println("2nd dose done for " + name);
        } else {
            System.out.println("Sorry " + name + ", you already received both doses.");
        }
    }

    public void pushVaccine(Vaccine v, String dose) {
        if (!dose.equals("1st Dose") && !dose.equals("2nd Dose")) {
            System.out.println("Sorry " + name + ", invalid dose request.");
            return;
        }

        if (!type.equals("Student") && age < 25) {
            System.out.println("Sorry " + name + ", Minimum age for taking vaccines is 25 years now.");
            return;
        }

        if (vaccine == null) {
            if (dose.equals("2nd Dose")) {
                System.out.println("Sorry " + name + ", invalid dose request.");
                return;
            } else {
                vaccine = v;
                dose1 = true;
                System.out.println("1st dose done for " + name);
            }
        } else if (!vaccine.getName().equals(v.getName())) {
            System.out.println("Sorry " + name + ", you can’t take 2 different vaccines");
        } else if (dose.equals("2nd Dose")) {
            if (!dose1) {
                System.out.println("Sorry " + name + ", invalid dose request.");
            } else if (!dose2) {
                dose2 = true;
                System.out.println("2nd dose done for " + name);
            } else {
                System.out.println("Sorry " + name + ", you already received both doses.");
            }
        } else {
            System.out.println("Sorry " + name + ", you already received both doses.");
        }
    }

    public void showDetail() {
        System.out.println("Name: " + name + " Age: " + age + " Type: " + type);
        if (vaccine != null) {
            System.out.println("Vaccine name: " + vaccine.getName());
            System.out.println("1st dose: Given");
            if (dose2) {
                System.out.println("2nd dose: Given");
            } else {
                System.out.println("2nd dose: Please come after " + vaccine.getDays() + " days");
            }
        }
    }
}