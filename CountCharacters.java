package java_roadmap;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character you want to count: ");
        String s = sc.nextLine();

        System.out.println(s.length());


    }
}
