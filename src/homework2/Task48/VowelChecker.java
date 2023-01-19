package homework2.Task48;

public class VowelChecker
{
    public static boolean checkVowels(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                return false;
            }
        }
        return true;
    }
}
