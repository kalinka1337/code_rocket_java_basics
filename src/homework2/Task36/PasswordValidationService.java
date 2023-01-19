package homework2.Task36;

public class PasswordValidationService
{
    public static boolean isValidPassword(String password){
        int digitCount = 0;
        if(password.length() < 10) {
            System.err.println("Error: Password must have at least 10 characters!");
            return false;
        }

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(!Character.isLetterOrDigit(c)) {
                System.err.println("Error: Password can only consist of letters and digits!");
                return false;
            }
            if (Character.isDigit(c)){
                digitCount++;
            }
        }
        if(digitCount < 2){
            System.err.println("Error: Password must contain at least 2 digits!");
            return false;
        }
        System.out.println("SUCCESS!");
        return true;
    }
}
