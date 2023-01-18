package homework2.Task26;

public class ReverseFunctionService
{
    public static String reverseString(String input) {
        String[] words = input.split("[.,\\s]+");
        StringBuilder reversed = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            reversed.append(new StringBuilder(words[i]).reverse());
            if(i < words.length - 1) reversed.append(input.charAt(input.indexOf(words[i])+words[i].length()));
        }
        return reversed.toString();
    }
}
