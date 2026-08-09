package java_roadmap;

import java.util.Scanner;

public class CharacterOccurence {

    public void characterOccurence(String s, char ch){
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Occurence: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        CharacterOccurence characterOccurence = new CharacterOccurence();
        characterOccurence.characterOccurence(s,ch);

        sc.close();
    }
}
