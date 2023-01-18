package homework2.Task18;

public class Consonants
{
    public static void main(String[] args) {
        String string = "Hello, have a good day";
        System.out.println("Current string is: " + string);
        ConsonantFilteringService consonantFilteringService = new ConsonantFilteringService();
        consonantFilteringService.stringBuilder(string);
    }
}
