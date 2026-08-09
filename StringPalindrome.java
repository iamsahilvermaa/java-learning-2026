package java_roadmap;

import java.util.Scanner;

public class StringPalindrome {

    public void stringPalindrome(String s) {
        String reverseString = "";

        for (int i = s.length()-1; i >= 0; i--)
        {
            reverseString = reverseString + s.charAt(i);
        }

        if(s.equals(reverseString))
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s =  sc.nextLine();

        StringPalindrome p = new StringPalindrome();


        p.stringPalindrome(s);

        sc.close();
    }

}
