package homework2.Task20;

import java.util.*;
public class PalindromeDemo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome: ");
        String text = input.nextLine();

        if(Palindrome.isPalindrome(text)){
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
