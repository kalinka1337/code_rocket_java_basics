package homework2.Task8;

import java.util.*;

public class ComplexDemo
{
    public static void main(String[] args) {
        System.out.println("Input first REAL number: ");
        int firstReal = Complex.inputReal();
        System.out.println("Input first IMAGINARY number: ");
        int firstImaginary = Complex.inputImaginary();
        Complex firstComplex = new Complex(firstReal, firstImaginary);

        System.out.println("Input second REAL number: ");
        int secondReal = Complex.inputReal();
        System.out.println("Input second IMAGINARY number: ");
        int secondImaginary = Complex.inputImaginary();
        Complex secondComplex = new Complex(secondReal, secondImaginary);

        System.out.println("Sum of complex numbers is: ");
        Complex addition = Complex.sum(firstComplex,secondComplex);
        System.out.println(addition.printComplex());

        System.out.println("Difference of complex numbers is: ");
        Complex difference = Complex.diff(firstComplex, secondComplex);
        System.out.println(difference.printComplex());

        System.out.println("Product of complex numbers is: ");
        Complex product = Complex.prod(firstComplex, secondComplex);
        System.out.println(product.printComplex());


    }
}
