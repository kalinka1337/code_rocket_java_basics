package homework3.Task19;
import java.util.*;
public class Pyramid
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int rows = input.nextInt();

        PyramidGenerator pyramidGenerator = new PyramidGenerator();
        pyramidGenerator.generate(rows);
    }
}
