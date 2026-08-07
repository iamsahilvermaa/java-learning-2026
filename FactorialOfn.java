package java_roadmap;

import java.util.Scanner;

public class FactorialOfn {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;

        System.out.println("---Sum of n numbers is ---");
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }

        System.out.println(result);

        sc.close();
    }
}
