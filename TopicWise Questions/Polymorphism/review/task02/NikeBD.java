package task02;

public class NikeBD {
    private String branch;
    private int jordanStock;
    private int cortezStock;
    private int kobeStock;
    private int sold;

    private static int totalJordan = 0;
    private static int totalCortez = 0;
    private static int totalKobe = 0;
    private static int totalSold = 0;
    private static int branchCount = 0;

    public NikeBD(String branch) {
        this.branch = branch;
        this.jordanStock = 0;
        this.cortezStock = 0;
        this.kobeStock = 0;
        this.sold = 0;
        branchCount++;
    }

    public static void status() {
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: " + branchCount);
        System.out.println("Currently Stocked: Jordan: " + totalJordan + ", Cortez: " + totalCortez + ", Kobe: " + totalKobe);
        System.out.println("Sold: " + totalSold);
    }

    public void details() {
        System.out.println("Nike " + branch + " outlet:");
        System.out.println("Products Currently Stocked: Jordan: " + jordanStock + ", Cortez: " + cortezStock + ", Kobe: " + kobeStock);
        System.out.println("Sold: " + sold);
    }

    public void restockProducts(String product, int qty) {
        if (product.equals("Jordan")) {
            jordanStock += qty;
            totalJordan += qty;
        } else if (product.equals("Cortez")) {
            cortezStock += qty;
            totalCortez += qty;
        } else if (product.equals("Kobe")) {
            kobeStock += qty;
            totalKobe += qty;
        }
    }

    public void restockProducts(String[] products, int[] qtys) {
        for (int i = 0; i < products.length; i++) {
            restockProducts(products[i], qtys[i]);
        }
    }

    public void productSold(String prod1, int qty1, String prod2, int qty2) {
        sellProduct(prod1, qty1);
        sellProduct(prod2, qty2);
    }

    private void sellProduct(String product, int qty) {
        if (product.equals("Jordan")) {
            jordanStock -= qty;
            totalJordan -= qty;
        } else if (product.equals("Cortez")) {
            cortezStock -= qty;
            totalCortez -= qty;
        } else if (product.equals("Kobe")) {
            kobeStock -= qty;
            totalKobe -= qty;
        }
        sold += qty;
        totalSold += qty;
    }
}
