package instance_variable.task_15;

public class Assignment {
    public int tasks;
    public String difficulty;
    public Boolean submission= false;    //if i keep submission as it is, null koi????

    public void printDetails() {
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);

    }
    public String makeOptional() {

        if(submission == true) {
            submission = false;
            return "Assignment will not require submission";
        }

            return "Submission is already not required";






    }
}
