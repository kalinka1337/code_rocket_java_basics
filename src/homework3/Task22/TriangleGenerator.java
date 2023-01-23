package homework3.Task22;

public class TriangleGenerator
{
    public void create(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            int c = 1;
            for (int k = 0; k <= i; k++){
                System.out.print(c + " ");
                c = c * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
