package instance_variable.task_29;

public class Dog {
    public String name= "A dog";
    public String color;

    public void changeColor (String color) {
        this.color= color;
        if(!this.name.equals("A dog")) {
            System.out.println (this.name + " is " + this.color);
        }

        else {
            System.out.println ("This dog is " + this.color);
        }

    }

    public String bark(){

        if(!this.name.equals("A dog") && this.color != null){
            return (this.name + " the " + this.color + " dog is barking");
        }

        else if(!this.name.equals("A dog")) {
            return (this.name + " is barking ");
        }

        else if (this.color != null) {
            return this.color+" dog is barking ";
        }

        else {
            return ("A dog is barking ");
        }

    }


    public void changeName(String name) {
        this.name = name;
    }

}
