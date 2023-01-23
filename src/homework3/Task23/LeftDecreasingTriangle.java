package homework3.Task23;

public class LeftDecreasingTriangle
{
    public void decreasing(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n - i; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
