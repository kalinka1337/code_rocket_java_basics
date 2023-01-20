package homework3.Task2;

public class DiscriminantEquation
{
    public void discriminant(int a, int b, int c){
        double discriminant = b * b - 4 * a * c;

        if(discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant) / (2 * a));
            double root2 = (-b - Math.sqrt(discriminant) / (2 * a));
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0){
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("There are no real roots");
        }
    }
}
