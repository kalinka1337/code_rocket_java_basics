package lesson6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounterTest
{
    public static void main(String[] args) {
        shouldReturnEmptyIfStringIsEmpty("");
        shouldReturnEmptyIfStringIsSpace(" ");
        shouldReturnEmptyIfStringIsNonAlphabetical("420+69./69-420.*");
        shouldReturnOneIfStringIsOneWord("one");
    }

    public static void shouldReturnEmptyIfStringIsEmpty (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String, Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsEmpty: SUCCESS, expected Empty map, and is: " + result);
        } else {
            System.err.println("shouldReturnEmptyIfStringIsEmpty: FAILED, expected Empty map, but is: " + result);
        }


    }

    public static void shouldReturnEmptyIfStringIsSpace (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String, Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsSpace: SUCCESS, expected Empty map, and is: " + result);
        } else {
            System.err.println("shouldReturnEmptyIfStringIsSpace: FAILED, expected Empty map, but is: " + result);
        }
    }

    public static void shouldReturnEmptyIfStringIsNonAlphabetical(String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String, Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsNonAlphabetical: SUCCESS, expected Empty map, and is: " + result);
        } else {
            System.err.println("shouldReturnEmptyIfStringIsNonAlphabetical: FAILED, expected Empty map, but is: " + result);
        }

    }

    public static void shouldReturnOneIfStringIsOneWord(String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String, Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 1);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturnOneIfStringIsOneWord: SUCCESS, expected" + expectedResult + ", and is: " + result);
        } else {
            System.err.println("shouldReturnOneIfStringIsOneWord: FAILED, expected" + expectedResult + ", but is: " + result);
        }
    }
}
