package instance_variable.task_08;

public class Bird {
    public String name;
    public int p =0;

    public void flyUp (int x){

        this.p += x;
        if(this.p==0){
            System.out.println(name+ " has flown up " + x+ " feet and landed");
        }
        else {
            System.out.println(name+ " has flown up " + x+ " feet");
        }
    }

    public void flyDown (int x){
        this.p -= x;
        if(this.p==0){
            System.out.println(name+ " has flown up " + x+ " feet and landed");
        }
        else if(this.p <0){
            System.out.println(name+ " cannot fly down " + x+ " feet");
            this.p +=x;
        }
        else{
            System.out.println(name+ " has flown up " + x+ " feet");
        }

    }

    public void makeNoise (){
        if(this.name.equals("Parrot")){
            System.out.println("Squawk");
        }
        else if(this.name.equals("Eagle")){
            System.out.println("Squee");
        }
    }

}
