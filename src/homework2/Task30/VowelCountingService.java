package homework2.Task30;

public class VowelCountingService
{
    public void counting(String test) {
        int vowels = 0;

        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
        }
        System.out.println("Number of vowels in a string: " + vowels);
    }
}

