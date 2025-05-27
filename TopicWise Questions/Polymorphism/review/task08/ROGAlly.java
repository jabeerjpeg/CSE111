package task08;

public class ROGAlly extends HandheldPC {
    private boolean rgb;

    public ROGAlly(String model, int ram, int storage, boolean rgb) {
        super("ASUS", model, "Windows 11", ram, storage);
        this.rgb = rgb;
    }

    @Override
    public void bootUp() {
        String rgbStatus = rgb ? "ON" : "OFF";
        System.out.println("ROG Ally (" + getModel() + ") booting into Windows 11 with RGB " + rgbStatus);
    }

    public void syncRGBWithGame() {
        if (rgb) {
            System.out.println(getModel() + " syncing RGB lights with gameplay...");
        } else {
            System.out.println(getModel() + " has RGB disabled.");
        }
    }
}

