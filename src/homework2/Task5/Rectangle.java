package homework2.Task5;

public class Rectangle
{
    double length, breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea(){
        return length * breadth;
    }
}
