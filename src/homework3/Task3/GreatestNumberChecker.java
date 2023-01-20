package homework3.Task3;

public class GreatestNumberChecker
{
    public void check(int a, int b, int c){
        int greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        System.out.println("The greatest: " + greatest);
    }
}
