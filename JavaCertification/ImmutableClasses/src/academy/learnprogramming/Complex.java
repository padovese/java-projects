package academy.learnprogramming;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public Complex plus(Complex b){
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex b){
        double newReal = real - b.real;
        double newImaginary = imaginary - b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b){
        double newReal = real * b.real;
        double newImaginary = imaginary * b.imaginary;
        return new Complex(newReal, newImaginary);
    }
}
