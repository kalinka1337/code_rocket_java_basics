package homework2.Task45;

public class PositiveNegativeNumberValidationService
{
    public static int extractFirstDigit(int num) {
        String numString = String.valueOf(num);
        if(num<0)
            return Integer.parseInt(numString.substring(1,2));
        else
            return Integer.parseInt(numString.substring(0,1));
    }
}
