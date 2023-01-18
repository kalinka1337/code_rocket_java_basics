package homework2.Task32n2;

public class PentagonalNumberCreator
{
    public void creator(int count){
        count = 1;
        for (int i = 1; i <= 50; i++){
            System.out.printf("%-6d", getPentagonalNumber(i));
            if(count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
    }

    public static int getPentagonalNumber(int i){
        return(i * (3 * i - 1)) / 2;
    }
}
