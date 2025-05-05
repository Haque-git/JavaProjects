package CSE111.Assignment_08;

public class ComplexNumber extends RealNumber {
    
    public double imaginaryValue;
    
    public ComplexNumber() {
        this(1.0, 1.0);
    } 

    public ComplexNumber(double realValue, double imaginaryValue) {
        super(realValue);
        this.imaginaryValue = imaginaryValue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImaginaryPart: " + this.imaginaryValue;
    }
}
