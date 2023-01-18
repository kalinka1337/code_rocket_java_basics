package homework2.Task4;

public class Triangle
{
    public int side1, side2, side3;
    public double getArea(){
        double semiPerimeter = (side1 + side2 + side3)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-3)*(semiPerimeter-4)*(semiPerimeter-5));
    }

    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

//    public int getSide1() { return side1; }
//    public int getSide2() {
//        return side2;
//    }
//    public int getSide3() {
//        return side3;
//    }



}
