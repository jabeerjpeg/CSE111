package task12;

public class Tester {
    public static void main(String[] args) {
        Device d1 = new GamingLaptop();
        Device d2 = new Laptop();
        Device d3 = new Device();
        Object d4 = new Laptop();
        Laptop d5 = new GamingLaptop();
        Object d6 = new Smartphone();


//        d1.start();
//        d2.start();
//        d4.start();
//        d6.start();
//        d1.shutdown();
//        d3.shutdown();
//        d4.shutdown();
//        d5.shutdown();
//        d6.shutdown();
//        ((GamingLaptop)d4).notifyUser();
//        ((GamingLaptop)d6).shutdown();
//        ((Smartphone)d1).notifyUser();
//        ((Smartphone) d6).start();
//        ((GamingLaptop) d5).start();
        ((GamingLaptop)d5).notifyUser();
    }
}
