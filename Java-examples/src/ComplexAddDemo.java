public class ComplexAddDemo {
    //for real and imaginary parts of complex numbers
    double real, img;

    //constructor to initialize the complex number
    ComplexAddDemo(double r, double i){
        this.real = r;
        this.img = i;
    }
    // method in the name of sum to return the complex number
    public static ComplexAddDemo sum(ComplexAddDemo c1, ComplexAddDemo c2)
    {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexAddDemo temp = new ComplexAddDemo(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        //returning the output complex number
        return temp;
    }
    public static void main(String args[]) {
        ComplexAddDemo c1 = new ComplexAddDemo(5.5, 4);
        ComplexAddDemo c2 = new ComplexAddDemo(1.2, 3.5);
        ComplexAddDemo temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}