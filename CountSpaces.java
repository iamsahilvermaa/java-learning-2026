package java_roadmap;

import java.util.Scanner;

public class CountSpaces {

    public void countSpaces(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountSpaces cs = new CountSpaces();

        System.out.println("Enter the characters: ");

        String s = sc.nextLine();

        System.out.print("Spaces: ");
        cs.countSpaces(s);
    }
}
