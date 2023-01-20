package homework3.Task6;

import java.util.*;
import java.text.DecimalFormat;
public class isEqual
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Input floating-point number: ");
        float num1 = input.nextFloat();
        System.out.println("Input floating-point another number: ");
        float num2 = input.nextFloat();

        if (Objects.equals(df.format(num1), df.format(num2))) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
