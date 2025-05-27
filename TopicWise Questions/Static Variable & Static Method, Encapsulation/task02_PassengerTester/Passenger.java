package task02_PassengerTester;

public class Passenger
{


    public static int no_of_passenger=0;

    public static double  total_fare = 0.0;

    public String name;


    public double  fare;


  public Passenger (String nm ,
                    double x)
  {
      this.name=nm;


      this.fare+=x*20;


      this.no_of_passenger++;


      Passenger.total_fare+=this.fare;

  }

  public void passengerDetails()
  {

      System.out.println("Name: "
              + name);

      System.out.println("Fare: "+
              fare +" TK");

  }

  public void setBaggageWeight (double
                                        weight)
  {
      Passenger.total_fare
              +=weight*10;


      this.fare+=weight*10;
  }


}
