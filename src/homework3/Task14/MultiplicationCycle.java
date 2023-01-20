package homework3.Task14;

public class MultiplicationCycle
{
    public void calculate(int n){
        for(int i = 0; i <= n; i++ ){
            int calculus = n * i;
            System.out.println(n + " X " + i + " = " + calculus);
        }
    }
}
