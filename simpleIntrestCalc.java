package java_roadmap;

import java.util.Scanner;

public class simpleIntrestCalc {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        int Principle = sc.nextInt();

        System.out.println("Enter Rate: ");
        int Rate = sc.nextInt();

        System.out.println("Enter Time: ");
        int Time = sc.nextInt();

        int intrest = (Principle * Rate * Time) / 100;
        System.out.println("Simple Intrest: " + intrest);
        int total = intrest + Principle;
        System.out.println("Total Amount: " + total);
    }
}
