package task02_vehicle2010;

public class Vehicle2010 extends Vehicle


{
        public Vehicle2010()
        {
        }

        public void moveLowerLeft()


        {
            x=x-1;
            y=y-1;
        }
        public void moveUpperRight()


        {
            y=y+1;
            x=x+1;
        }
        public void moveLowerRight()


        {
            x=x+1;
            y=y-1;
        }
}
