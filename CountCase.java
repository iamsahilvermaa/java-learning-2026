package java_roadmap;

import java.util.Scanner;

public class CountCase {

    public void countCase(String s) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                countUpperCase++;
            }
            if(Character.isLowerCase(s.charAt(i))) {
                countLowerCase++;
            }
        }


        System.out.println("Uppercase case: " + countUpperCase);
        System.out.println("Lowercase case: " + countLowerCase);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        CountCase cc = new CountCase();
        cc.countCase(s);
    }
}
