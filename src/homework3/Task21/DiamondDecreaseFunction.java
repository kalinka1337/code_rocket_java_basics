package homework3.Task21;

public class DiamondDecreaseFunction
{
    public void decrease(int n){
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
