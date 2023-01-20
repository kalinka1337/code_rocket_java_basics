package homework3.Task12;

public class Calculation
{
    public void sum(int a, int b, int c, int d, int e){
        int sum = a + b + c + d + e;
        System.out.println("The sum of 5 numbers is: " + sum);
    }

    public void average(int a, int b, int c, int d, int e){
        int average = (a + b + c + d + e) / 5;
        System.out.println("The Average is: " + average);
    }
}
