package homework2.Task3;

import static java.lang.Math.sqrt;
public class Triangle
{
    public static void main(String[] args) {
        int side1 = 3, side2 = 4, side3 = 5, perimeter, semiPerimeter;
        perimeter = side1 + side2 + side3;
        semiPerimeter = perimeter / 2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }


}
