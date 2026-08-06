package java_roadmap;

import java.util.Scanner;

public class CelsiusFehrenheitConverter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        int Celsius = sc.nextInt();

        int Fehrenheit = (Celsius * 9/5) + 32;

        System.out.println("C: " + Celsius + " \n" + "F: " + Fehrenheit);

        sc.close();


    }
}
