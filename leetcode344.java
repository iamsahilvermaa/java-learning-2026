package java_roadmap;

import java.util.Scanner;

public class leetcode344 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        char[] s = sc.nextLine().toCharArray();

        leetcode344 obj = new leetcode344();
        obj.reverseString(s);

        sc.close();
    }
}
