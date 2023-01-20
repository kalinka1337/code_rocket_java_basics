package homework3.Task11;

public class NaturalNumberCounter
{
    public void count(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum += 1;
        }
        System.out.println("The Sum of Natural Numbers up to " + n + " terms: " + sum);
    }
}
