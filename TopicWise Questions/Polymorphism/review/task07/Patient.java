package task07;

public class Patient {
    protected static int idCounter = 1;
    protected static int totalPatients = 0;
    protected static int outPatients = 0;
    protected static int inPatients = 0;

    protected String name;
    protected String doctor;
    protected String patientID;

    public Patient(String name, String doctor) {
        this.name = name;
        this.doctor = doctor;
        this.patientID = "P" + String.format("%02d", idCounter++);
        totalPatients++;
        outPatients++;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientID + ", Name: " + name + "\nDoctor: " + doctor;
    }

    public static void details() {
        System.out.println("Total patients: " + totalPatients + ".");
    }

    public static void details(Patient[] arr) {
        System.out.println("Details of " + arr.length + " selected patients:");
        for (Patient p : arr) {
            System.out.println("== == == == ==");
            System.out.println(p);
            if (p instanceof InPatient) {
                InPatient ip = (InPatient) p;
                System.out.println("Department: " + ip.getDepartment());
            }
        }
    }

    public static void increaseInPatient() {
        inPatients++;
        outPatients--;
    }

    public static void showInOutStats() {
        System.out.println("Admitted In-Patients: " + inPatients + ".");
        System.out.println("Out-Patients: " + outPatients + ".");
    }
}

