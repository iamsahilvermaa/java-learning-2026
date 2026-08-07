package java_roadmap;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int n1 = 0;
        int sum = 0;

        while (n != 0) {
            n1 = n % 10;
            n = n / 10;
            sum = sum + n1;
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
