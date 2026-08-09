package java_roadmap;

import java.util.Scanner;

public class CountConsonants {

    public void countConsonants(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)) &&
                    s.charAt(i) != 'a' &&
                    s.charAt(i) != 'e' &&
                    s.charAt(i) != 'i' &&
                    s.charAt(i) != 'o' &&
                    s.charAt(i) != 'u') {
                count++;
            }
        }
        System.out.println("Consonants: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the characters: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        CountConsonants cc = new CountConsonants();
        cc.countConsonants(s);

        sc.close();
    }
}
