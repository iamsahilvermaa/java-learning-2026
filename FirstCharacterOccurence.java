package java_roadmap;

import java.util.Scanner;

public class FirstCharacterOccurence {

    public void firstOccurence(String s, char ch) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ch) {
                System.out.println("FirstOccurence: " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        FirstCharacterOccurence foc = new FirstCharacterOccurence();

        foc.firstOccurence(s, ch);

        sc.close();
    }
}
