package instance_variable.task_31;

public class MagicItem {
    public String name;
    public int level = 0;
    public String[] item = new String[3];

    public void newCharacter(String x) {
        this.name = x;
        this.level = 0;
    }

    public void displayInfo() {
        System.out.println("Character Name: " + this.name);
        System.out.println("Energy Level: " + this.level);
        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + ": " + this.item[i]);
        }
    }

    public void findItem(String x) {
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (this.item[i] == null) {
                this.item[i] = x;
                System.out.println(this.name + " found a " + x);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("All item slots occupied");
        }
    }

    public void useItem(String x) {
        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (x.equals(this.item[i])) {
                this.item[i] = null;
                found = true;
                break;
            }
        }

        if (found) {
            if (x.equals("Potion")) {
                System.out.println(this.name + " used a Potion");
                this.level += 50;
            } else if (x.equals("Elixir")) {
                System.out.println(this.name + " used an Elixir");
                this.level += 100;
            } else if (x.equals("Amulet")) {
                System.out.println(this.name + " used an Amulet");
                this.level += 200;
            }

            System.out.println("Energy Level after using item: " + this.level);
        }

        else {
            System.out.println("Item not in inventory");
        }
    }
}
