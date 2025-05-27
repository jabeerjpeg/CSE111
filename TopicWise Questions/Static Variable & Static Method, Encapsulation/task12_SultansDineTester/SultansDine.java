package task12_SultansDineTester;

public class SultansDine {
    public static int total;
    public static int sell;
    public String name;
    public static SultansDine [] arr1= new SultansDine [3];
    public static int count;
    public int branch_sell;
    public double percent;



    public void sellQuantity(int num) {
        if(num < 10 ){
            branch_sell = num* 300;
        }
        else if (num < 20 ){
            branch_sell = num* 350;
        }
        else{
            branch_sell = num* 400;
        }
        sell += branch_sell;

        for(int i = 0 ; i < count ; i++) {
            arr1[i].percent = ((double) arr1[i].branch_sell / sell) * 100;
        }

    }

        public static void details(){
            System.out.println("Total Number of branch(s): " + total);
            System.out.println("Total Sell: " + sell + " Taka");
            for( int i = 0; i < count; i++) {
                System.out.println("Branch Name: " + arr1[i].name
                + ", Branch Sell: "+ arr1[i].branch_sell + " Taka" );

                System.out.printf("Branch consists of total sell's %.2f \n" , arr1[i].percent  );

            }
        }

        public SultansDine(String name){
            this.name=name;
            arr1[count] = this;
            count++;
            total++;

        }

        public void branchInformation(){
        System.out.println("Branch Name: " + this.name);
        System.out.println("Branch sell " + this.branch_sell + " Taka");
        }

}


