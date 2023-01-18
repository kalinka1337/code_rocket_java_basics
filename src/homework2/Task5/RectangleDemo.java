package homework2.Task5;

public class RectangleDemo
{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println(rectangle.returnArea());
        System.out.println(rectangle2.returnArea());
    }
}
