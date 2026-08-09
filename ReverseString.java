package java_roadmap;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string that you want to reverse: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        sc.close();
    }


}
