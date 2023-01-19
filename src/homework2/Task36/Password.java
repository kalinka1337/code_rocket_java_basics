package homework2.Task36;

import java.util.*;
public class Password
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();

        PasswordValidationService.isValidPassword(password);
    }
}
