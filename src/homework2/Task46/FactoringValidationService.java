package homework2.Task46;

public class FactoringValidationService
{
    public static void displayFactorsOfThree(int num) {
        int count = 0;
        System.out.print("Factors of 3 of the said integer: " + num + " = ");
        while (num % 3 == 0) {
            count++;
            num /= 3;
        }
        for (int i = 1; i <= count; i++) {
            System.out.print("3 * ");
        }
        System.out.print(num);
    }
}
