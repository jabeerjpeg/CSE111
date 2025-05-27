package task08;

public class SteamDeck extends HandheldPC {

    public SteamDeck(String model, int ram, int storage) {
        super("Valve", model, "SteamOS", ram, storage);
    }

    @Override
    public void bootUp() {
        System.out.println("Steam Deck (" + getModel() + ") booting into SteamOS...");
    }

    public void launchSteamBigPicture() {
        System.out.println(getModel() + " is launching Steam Big Picture Mode.");
    }
}



