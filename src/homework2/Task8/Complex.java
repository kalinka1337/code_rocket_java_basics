package homework2.Task8;

import java.util.*;
public class Complex
{
    int real;
    int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }


    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public static int inputReal() {
       Scanner inputReal = new Scanner(System.in);
//       System.out.println("Input real number: ");
       return inputReal.nextInt();
   }

   public static int inputImaginary(){
       Scanner inputImaginary = new Scanner(System.in);
//       System.out.println("Input imaginary number: ");
       return inputImaginary.nextInt();
   }

    public static Complex sum(Complex firstComplex, Complex secondComplex){
        int allReal = firstComplex.getReal() + secondComplex.getReal();
        int allImaginary = secondComplex.getImaginary() + secondComplex.getImaginary();
        Complex resultAddition = new Complex(allReal, allImaginary);
        return resultAddition;
    }

    public static Complex diff(Complex firstComplex, Complex secondComplex){
        int allReal = firstComplex.getReal() - secondComplex.getReal();
        int allImaginary = secondComplex.getImaginary() - secondComplex.getImaginary();
        Complex resultDifference = new Complex(allReal, allImaginary);
        return resultDifference;
    }

    public static Complex prod(Complex firstComplex, Complex secondComplex){
        int allReal = (firstComplex.getReal() * secondComplex.getReal()) - (firstComplex.getImaginary() * secondComplex.getImaginary());
        int allImaginary = (firstComplex.getImaginary() * secondComplex.getReal()) + (firstComplex.getReal() * secondComplex.getImaginary());
        Complex resultProduct = new Complex(allReal, allImaginary);
        return resultProduct;
    }


    public String printComplex(){
        return this.real + " + " + this.imaginary + "i";
    }

}
