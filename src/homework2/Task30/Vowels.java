package homework2.Task30;
import java.util.*;

public class Vowels
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = input.nextLine();

        VowelCountingService vowelCountingService = new VowelCountingService();
        vowelCountingService.counting(string);
    }
}
