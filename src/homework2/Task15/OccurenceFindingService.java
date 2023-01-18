package homework2.Task15;

public class OccurenceFindingService
{
    public void check(String test){
        System.out.println("First occurence of the letter 'o': " + test.indexOf("o"));
        System.out.println("First occurence of the letter ',': " + test.indexOf(","));
        System.out.println("Last occurence of the letter 'o': "+ test.lastIndexOf("o"));
        System.out.println("Last occurence of the character ',': " + test.lastIndexOf(","));
    }
}
