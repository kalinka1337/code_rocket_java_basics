package homework2.Task19;

import java.util.HashMap;
public class AlphabetCounter
{
    private HashMap<Character, Integer> count;

    public AlphabetCounter(){
        this.count = new HashMap<>();
    }

    public void countAlphabets(String input) {
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
    }

    public HashMap<Character, Integer> getCount(){
        return count;
    }
}
