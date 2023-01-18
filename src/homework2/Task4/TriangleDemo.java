package homework2.Task4;

public class TriangleDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;

        System.out.println("Area of Triangle is: " + triangle.getArea());
        System.out.println("Perimeter of Triangle is: " + triangle.getPerimeter());

    }
}
