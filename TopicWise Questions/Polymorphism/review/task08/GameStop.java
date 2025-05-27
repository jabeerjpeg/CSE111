package task08;

public class GameStop {
    private HandheldPC[] devices;
    private int count = 0;

    public GameStop(int size) {
        devices = new HandheldPC[size];
        System.out.println("GameStop brought " + size + " devices.");
    }

    public void addDevice(HandheldPC device) {
        if (device instanceof SteamDeck || device instanceof ROGAlly) {
            if (count < devices.length) {
                devices[count++] = device;
                System.out.println(device.getBrand() + " " + device.getModel() + " added to shelf");
            } else {
                System.out.println("No more space on shelf for new devices.");
            }
        } else {
            System.out.println("Invalid device type. Only SteamDeck and ROGAlly are allowed.");
        }
    }

    public void listDevices() {
        int steamCount = 0;
        int rogCount = 0;

        System.out.println("Total devices: " + count);
        for (int i = 0; i < count; i++) {
            if (devices[i] instanceof SteamDeck) {
                steamCount++;
            } else if (devices[i] instanceof ROGAlly) {
                rogCount++;
            }
        }

        System.out.println("Steam Decks: " + steamCount);
        System.out.println("ROG Allies: " + rogCount);
        System.out.println("Devices in store:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + devices[i]);
        }
    }

    public void filterByOS(String os) {
        System.out.println("Devices running " + os + ":");
        for (int i = 0; i < count; i++) {
            if (devices[i].getOS().equals(os)) {
                System.out.println("- " + devices[i]);
            }
        }
    }

    public void startGamingSession(HandheldPC device) {
        if (device instanceof SteamDeck) {
            SteamDeck sd = (SteamDeck) device;
            sd.bootUp();
            sd.launchSteamBigPicture();
        } else if (device instanceof ROGAlly) {
            ROGAlly ra = (ROGAlly) device;
            ra.bootUp();
            ra.syncRGBWithGame();
        }
    }
}

