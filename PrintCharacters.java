package java_roadmap;

import java.util.Scanner;

public class PrintCharacters {

    public void printCharacters(String s) {
        for (int i = 0; i <s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String s = sc.nextLine();

        PrintCharacters p = new PrintCharacters();
        p.printCharacters(s);

        sc.close();
    }
}
