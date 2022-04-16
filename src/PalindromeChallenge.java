import java.util.Scanner;

public class PalindromeChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original;
        String reverse = "";
        System.out.println("Enter a word or a number to check if it is a palindrome: ");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length-1; i>=0 ; i--)
            reverse= reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome!");
        else
            System.out.println("Entered string/number is NOT a palindrome!");
    }
}
