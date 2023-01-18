package homework2.Task18;

public class ConsonantFilteringService
{
    public void stringBuilder(String test){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < test.length(); i++){
            char ch = test.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                continue;
            }
            sb.append(ch);
            }
        String output = sb.toString();
        System.out.println("New string is: " + output);
    }

}
