package task19_CourseTester2;

public class Course {
    public String name;
    public String code;
    public String[] arr1 = new String[4];
    public int count;

    public void addContent(String ok) {
        if (count < 4) {
            arr1[count] = ok;
            System.out.println(this.arr1[count] + " was added.");
            count++;

        } else {
            System.out.println("Cannot add more content");
        }
    }

    public void addContent(String ok, String ok2) {
        addContent(ok);
        addContent(ok2);

    }

    public void updateDetails(String name, String code) {
        this.name = name;
        this.code = code;
    }


    public void printDetails() {
        System.out.println("Course Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Code: " + this.code);
        System.out.println("Course Syllabus: ");
        if (count == 0) {
            System.out.println("No content yet");
        } else {
            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    System.out.print(arr1[i]);
                } else {
                    System.out.print(arr1[i] + ", ");
                }
            }
            System.out.println();
        }
    }
}
