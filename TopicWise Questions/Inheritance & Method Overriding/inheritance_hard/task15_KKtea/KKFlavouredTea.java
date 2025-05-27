package task15_KKtea;

public class KKFlavouredTea extends KKTea{

    KKFlavouredTea(String name, int price, int bag){
        super("KK " + name + " Te" +
                "a", price, bag);

    }



    public static void  updateSoldStatusFlavoured(KKFlavouredTea tea)
    {
        if (!tea.status) {
            KKTea.other++;
            tea.status = true;
            KKTea.sales++;
        }

    }




}
