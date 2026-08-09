package java_roadmap;

import java.util.Scanner;

public class CountVowels {

    public void countVowels(String s)
    {
        int count = 0;

        for(int i=0;i<s.length();i++) {
            if(     s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Vowels: "+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the characters to be found vowels: ");
        String s =  sc.nextLine();

        CountVowels c =new CountVowels();
        c.countVowels(s);


        sc.close();
    }
}
