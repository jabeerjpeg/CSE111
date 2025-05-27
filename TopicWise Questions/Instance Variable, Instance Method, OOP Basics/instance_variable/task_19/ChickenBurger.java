package instance_variable.task_19;

public class ChickenBurger {
    public String bun= "Sesame";
    public int price = 200;
    public String sauceOption = "Less";
    public String spiceLevel = "Not Set";

    public String serveBurger() {
        if (this.spiceLevel.equals("Not Set")) {
            System.out.print("Cannot serve now. Customize Spice Level first.");
        }
        else {
            System.out.println("The burger is being served:-");
            System.out.println("Bun Type: " + this.bun);
            System.out.println("Price: " + this.price);
            System.out.println("Sauce Option: " + this.sauceOption);
            System.out.print("Spice Level: " + this.spiceLevel);

        }
        return "";


    }
    public void customizeSpiceLevel(String x) {
        if (x.equals("Spicy") || x.equals("Naga")) {
            this.spiceLevel = x;
            System.out.println("Spice level set to "+ this.spiceLevel);
        }
        else {
            System.out.println("This spice level is unavailable");
        }

    }
}

