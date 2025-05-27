package task07;

public class InPatient extends Patient {
    private String department;

    public InPatient(String name, String doctor, String department) {
        super(name, doctor);
        this.department = department;
        System.out.println("New patient admitted in " + department + ".");
        Patient.increaseInPatient();  // Adjust counts properly
    }
    /*
    when creating an InPatient,
    we are already incrementing the patient count as an outPatient through the
    super() constructor in Patient. So we subtract 1 from outPatients and add 1
    to inPatients to adjust the category.
     */

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }

    public static void details() {
        System.out.println("Total patients: " + totalPatients + ".");
        showInOutStats();
    }
}



