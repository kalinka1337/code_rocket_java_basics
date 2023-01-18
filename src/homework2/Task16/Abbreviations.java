package homework2.Task16;

public class Abbreviations
{
    public void refactoring(String test){
        String[] name = test.split(" ");
        String firstName = name[0];
        String secondName = name[1];
        String lastName = name[name.length-1];
        String firstNameAbbr = firstName.charAt(0) + ".";
        String secondNameAbbr = secondName.charAt(0) + ".";
        System.out.println(firstNameAbbr + secondNameAbbr + lastName);
    }

}
