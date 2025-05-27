package task05;

public class Phoenix extends MagicalCreature {
    private int rebirthCycles;

    public Phoenix(String name, int age, int rebirthCycles) {
        super(name, age);
        this.rebirthCycles = rebirthCycles;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sings an enchanting song.");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " is reborn with " + rebirthCycles + " rebirth cycles.");
    }

    public void regenerate() {
        System.out.println(name + " regenerates its body in a burst of flames.");
    }
}


