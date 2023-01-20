package homework3.Task15;

public class OddNumberCycle
{
    public void cycle(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++ ){
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        System.out.println("The sum of odd natural numbers up to " + n + " terms is: " + sum);
    }

}
