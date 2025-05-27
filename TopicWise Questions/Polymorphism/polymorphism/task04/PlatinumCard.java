package task04;

public class PlatinumCard extends CreditCard
{
    public PlatinumCard(String c, String a)
    {
        super(c, a,100);
    }

    public void spendCash(int tk)
    {
        System.out.println("Previous Reward Points: "  + rewardPoints);
        super.rewardPoints += (tk / 100) * 2;
        System.out.println("Reward points after spending " + tk + " taka: " + rewardPoints);
    }






}
