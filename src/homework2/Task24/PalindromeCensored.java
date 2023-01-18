package homework2.Task24;

public class PalindromeCensored {
    public static String replacePalindromes(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int j = i, k = i;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
            }
            if (j != i) {
                for (int l = j + 1; l <= k; l++) {
                    result.append("*");
                }
                i = k - 1;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}

