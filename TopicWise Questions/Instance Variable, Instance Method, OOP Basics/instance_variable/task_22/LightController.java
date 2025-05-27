package instance_variable.task_22;

public class LightController {
    public String status= "OFF";
    public int level=0;

    public void adjustBrightness(int level){
        this.level += level;
        if (status.equals("OFF")){
            System.out.println("Please turn  on the light first!");
            this.level -= level;
        }
        else if (this.level>10){
            this.level -= level;
            System.out.println("Brightness out of range. Set between 0 to 10");

        }
        else {
            System.out.println("Brightness adjusted.");
        }
    }
    public String resetSettings(){
        this.status = "ON";
        this.level = 1;
        return "Light settings has been reset.";

    }

    public void switchLight(){
        if (status.equals("OFF")) {
            this.status = "ON";
            System.out.println("Lights are now ON.");
            this.level = 1;
        }
        else {
            this.status = "OFF";
            System.out.println("Lights are now OFF.");
            this.level = 0;
        }
    }


    public void showLightStatus() {
        System.out.println("Light Status: " + status);
        System.out.println("Brightness Level: " + level);
    }
}