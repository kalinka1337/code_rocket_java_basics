package homework2.Task19;

import java.util.HashMap;
public class MaxOccurenceFinder
{
    public char findMaxAlphabet(HashMap<Character, Integer> count){
        char maxAlphabet = ' ';
        int maxCount = 0;

        for (char c : count.keySet()) {
            if(count.get(c) > maxCount) {
                maxAlphabet = c;
            }
        }
        return maxAlphabet;
    }
}
