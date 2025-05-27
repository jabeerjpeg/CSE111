package task08;

public class nigga {
    public static void main(String[] args) {
        GameStop store = new GameStop(4);
        System.out.println("---------------");
        HandheldPC d1 = new SteamDeck("SteamDeck OLED", 16, 512); //no output
        HandheldPC d2 = new ROGAlly("Z1 Extreme", 16, 512, true); //no output
        HandheldPC d3 = new SteamDeck("SteamDeck LCD", 16, 128); //no output
        HandheldPC d4 = new HandheldPC("Generic", "X99", "Ubuntu", 8, 128);//no output
        HandheldPC d5 = new ROGAlly("Z1", 12, 256, false); //no output
        HandheldPC d6 = new SteamDeck("SteamDeck Basic", 16, 64); //no output
        System.out.println("--- Adding Devices ---");
        store.addDevice(d1);
        store.addDevice(d2);
        store.addDevice(d3);
        store.addDevice(d4);
        store.addDevice(d5);
        store.addDevice(d6);
        System.out.println("\n--- Store Summary ---");
        store.listDevices();
        System.out.println("\n--- Filter: Devices with SteamOS ---");
        store.filterByOS("SteamOS");
        System.out.println("\n--- Booting Up Devices ---");
        ((SteamDeck) d1).bootUp();
        ((ROGAlly) d2).bootUp();
        d4.bootUp();
        ((ROGAlly) d5).bootUp();
        System.out.println("\n- Start Gaming Sessions -");
        store.startGamingSession(d1);
        System.out.println("--------------------");
        store.startGamingSession(d3);
        System.out.println("--------------------");
        store.startGamingSession(d5);
        System.out.println("--------------------");
        store.startGamingSession(d2);
    }
}
