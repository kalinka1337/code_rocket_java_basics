package homework3.Task25;

public class LetterDiamondGenerator
{
    public void generate(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 'A'; k < 'A' + i; k++){
                System.out.print((char)k);
            }
            for(int l = 'A' + i - 2; l >= 'A'; l--){
                System.out.print((char)l);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 'A'; k < 'A' + i; k++){
                System.out.print((char)k);
            }
            for(int l = 'A'+ i - 2; l >= 'A'; l--){
                System.out.print((char)l);
            }
            System.out.println();
        }
    }
}
