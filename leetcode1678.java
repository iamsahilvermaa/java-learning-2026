package java_roadmap;

import java.util.Scanner;

public class leetcode1678 {
    public String goalParser(String s){

       s = s.replace("()", "o");
       s = s.replace("(al)", "al");
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        leetcode1678 obj = new leetcode1678();

        System.out.println(obj.goalParser(s));

        sc.close();
    }
}
