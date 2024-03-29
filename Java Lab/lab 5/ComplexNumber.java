class ComplexNumber1 {
    private int real;
    private int img;

    public ComplexNumber1(){
        real=0;
        img=0;
    }

    public ComplexNumber1(int real,int img){
        this.real=real;
        this.img=img;
    }

    public void display(){
        System.out.println(real+" "+img);
    }

    public ComplexNumber1 addition(ComplexNumber1 t){
        ComplexNumber1 c4=new ComplexNumber1();
        c4.real= real+t.real;
        c4.img=img+t.img;
        return c4;
    }    

    // // Default constructor
    // public ComplexNumber() {
    //     this.real = 0.0;
    //     this.imaginary = 0.0;
    // }

    // // Parameterized constructor with real and imaginary parts
    // public ComplexNumber(double real, double imaginary) {
    //     this.real = real;
    //     this.imaginary = imaginary;
    // }

    // // Copy constructor
    // public ComplexNumber(ComplexNumber other) {
    //     this.real = other.real;
    //     this.imaginary = other.imaginary;
    // }

    // // Addition method to add two complex numbers
    // public ComplexNumber add(ComplexNumber other) {
    //     double newReal = this.real + other.real;
    //     double newImaginary = this.imaginary + other.imaginary;
    //     return new ComplexNumber(newReal, newImaginary);
    // }

    // // Getters and setters (if needed)
    // public double getReal() {
    //     return real;
    // }

    // public void setReal(double real) {
    //     this.real = real;
    // }

    // public double getImaginary() {
    //     return imaginary;
    // }

    // public void setImaginary(double imaginary) {
    //     this.imaginary = imaginary;
    // }

    // // toString method to represent the complex number as a string
    // @Override
    // public String toString() {
    //     return "(" + real + " + " + imaginary + "i)";
    // }

    // public static void main(String[] args) {
    //     // Example usage
    //     ComplexNumber c1 = new ComplexNumber(2.0, 3.0);
    //     ComplexNumber c2 = new ComplexNumber(1.5, 2.5);

    //     System.out.println("Complex Number 1: " + c1);
    //     System.out.println("Complex Number 2: " + c2);

    //     ComplexNumber sum = c1.add(c2);
    //     System.out.println("Sum of Complex Numbers: " + sum);
    // }
}

public class ComplexNumber{
    public static void main(String[] args) {
        ComplexNumber1 c1 = new ComplexNumber1(2, 3);
        ComplexNumber1 c2 = new ComplexNumber1(3, 2);
        ComplexNumber1 c3=  new ComplexNumber1();
        c1.display();
        c2.display();
        c3=c1.addition(c2);  
        c3.display();
            
    }
}