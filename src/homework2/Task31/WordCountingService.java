package homework2.Task31;

public class WordCountingService
{
    public static int counting(String input){
        if (input == null || input.isEmpty()){
            System.err.println("There are no words");
            return 0;
        }

        String[] words = input.split("\\s+");
        int count = 0;
        for(int i=0; i < words.length; i++) {
            count++; }
        return words.length;
    }
}
