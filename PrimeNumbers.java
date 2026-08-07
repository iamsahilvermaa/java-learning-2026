package java_roadmap;

import java.util.Scanner;

class PrimeChecker {

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (PrimeChecker.isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

        sc.close();
    }
}