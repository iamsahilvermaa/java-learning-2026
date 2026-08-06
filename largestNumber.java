package java_roadmap;

import java.util.Scanner;

public class largestNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();


        int ternary = (a > b) ? (a>b ? a : b) : (c>b ? c : b);

        System.out.println("Largest Number: "+ternary);


    }
}
