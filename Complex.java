import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Default constructor
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter methods
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Setter methods
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex sum(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get real and imaginary parts for complex number 1
        System.out.println("Enter real and imaginary parts for complex number 1:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        // Get real and imaginary parts for complex number 2
        System.out.println("Enter real and imaginary parts for complex number 2:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        scanner.close();

        // Calculate the sum of the two complex numbers
        Complex sum = complex1.sum(complex2);

        // Display the result
        System.out.println("Sum of the complex numbers: " + sum.getReal() + " + " + sum.getImaginary() + "i");
    }
}
