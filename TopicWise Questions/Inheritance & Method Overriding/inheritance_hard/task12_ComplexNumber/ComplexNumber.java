package task12_ComplexNumber;

public class ComplexNumber extends RealNumber {
    public double imaginary;

    public ComplexNumber()
    {
        super(1.0);

        this.imaginary = 1.0;

    }

    public ComplexNumber(double real,
                         double imaginary) {
        super(real);

        this.imaginary = imaginary;

    }

    public String toString() {
        return super.toString() + "\nImagi" +
                "naryPa" +
                "rt: " + imaginary;
    }

}



