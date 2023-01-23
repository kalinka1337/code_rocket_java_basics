package homework3.Task21;

import java.util.*;

public class Diamond
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number of rows: ");
        int rows = input.nextInt();

        DiamondIncreaseFunction diamondIncreaseFunction = new DiamondIncreaseFunction();
        diamondIncreaseFunction.increase(rows);

        DiamondDecreaseFunction diamondDecreaseFunction = new DiamondDecreaseFunction();
        diamondDecreaseFunction.decrease(rows);
    }
}
