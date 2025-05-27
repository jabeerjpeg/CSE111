package task04;

public class SignatureCard extends CreditCard
{
    public int num= 5;
    public void cardDetails() {
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: " + num);
    }


    public void spendCash(int tk) {
        System.out.println("Previous Reward Points: "  + rewardPoints);
        super.rewardPoints += (tk / 100) * 4;
        System.out.println("Reward points after spending " + tk + " taka: " + rewardPoints);

    }

    public SignatureCard(String c, String a) {
        super(c, a,200);
    }





}

