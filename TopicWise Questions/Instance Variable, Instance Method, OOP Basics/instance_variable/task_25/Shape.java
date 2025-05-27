package instance_variable.task_25;

public class Shape {
    public String name;
    public double area;

    public void setParameters(String s, int x){
        this.name=s;
        this.area=(3.1416*x*x);
    }

    public void setParameters(String s,int x,int y){
        this.name=s;
        this.area=(0.5 * x * y);

    }
    public void setParameters(String s,int x,int y,int z){
        this.name=s;
        this.area=(((x+y)/2)*z);
    }

    public String details(){
        System.out.println("Shape name: "+this.name);

        System.out.print("Area: "+ this.area);
        return "";


    }


}
