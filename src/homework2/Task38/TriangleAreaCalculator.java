package homework2.Task38;

public class TriangleAreaCalculator
{
    public void calculate(int side1, int side2, int side3) {

        int perimeter = side1 + side2 + side3;
        double halfPerimeter = perimeter / 2;

        double area = Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));
        System.out.println("The area of the triangle is: " + area);

    }
}
