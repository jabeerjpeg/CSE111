package task12;

public class Device {
    public void start() {
        System.out.println("Device starting");
    }
    public void shutdown() {
        System.out.println("Device shutting down");
        start();
    }
}



