package task05;

public class Dragon extends MagicalCreature {
    private int firePower;

    public Dragon(String name, int age, int firePower) {
        super(name, age);
        this.firePower = firePower;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars with a fiery breath!");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " breathes fire with power level: " + firePower);
    }

    public void fly() {
        System.out.println(name + " flies through the sky.");
    }
}




