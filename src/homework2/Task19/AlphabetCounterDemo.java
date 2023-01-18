package homework2.Task19;

import homework2.Task17.CharacterFindingService;

import java.util.HashMap;

public class AlphabetCounterDemo
{
    public static void main(String[] args) {
        String input = "abcdeveev";
        AlphabetCounter counter = new AlphabetCounter();
        counter.countAlphabets(input);
        HashMap<Character, Integer> count = counter.getCount();

        MaxOccurenceFinder finder = new MaxOccurenceFinder();
        char maxAlphabet = finder.findMaxAlphabet(count);

        System.out.println("Alphabet with maximum occurence: " + maxAlphabet);



    }
}
