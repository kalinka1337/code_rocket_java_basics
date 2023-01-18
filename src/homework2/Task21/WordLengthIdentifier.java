package homework2.Task21;

public class WordLengthIdentifier {
    public void stringLengthCheck(String string) {

        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];

        for(int k = 0; k < length; k++){
            if(large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }

}
