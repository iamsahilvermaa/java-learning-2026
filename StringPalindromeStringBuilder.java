package java_roadmap;

import java.util.Scanner;

public class StringPalindromeStringBuilder {

    public void StringPalindrome(String s) {
        StringBuilder reverseString = new StringBuilder(s);
        reverseString.reverse();

        if (s.contentEquals(reverseString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        StringPalindromeStringBuilder p = new StringPalindromeStringBuilder();
        p.StringPalindrome(s);

        sc.close();
    }

}
