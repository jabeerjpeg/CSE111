package task15_KKtea;

public class KKTea extends Tea{
    public int weight;
    public int teaBag;
    public static int sales;
    public static int tea;
    public static int other;


    public KKTea(int price, int bag)
    {
        super("KK Regular" +
                " Tea" , price);
        this.teaBag = bag;
        this.weight= bag * 2;
    }

    public KKTea( String name,
                  int price,
                  int bag) {
        super(name, price);
        this.teaBag = bag;
        this.weight= bag * 2;
    }

    public static void totalSales(){
        System.out.println("Total Sa" +
                "les: " + sales);
        System.out.println("KK Regula" +
                "r tea: " + tea );
        if(other >0){
            System.out.println("KK Fla" +
                    "voured tea: " + other );
        }
    }

    public static void updateSoldStatusRegular( KKTea t)
    {
        t.status = true;
        sales++;
        tea++;
    }
    // use obj location as super diye kora jabena as this is
    // a static method and boolean is a instance variable


    public void productDetail()
    {
        super.productDetail();
        System.out.println("Weight: " + weight + ", Tea Bags: " + teaBag);

    }


}
