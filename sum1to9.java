package java_roadmap;

import java.util.Scanner;

public class sum1to9 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        System.out.println("---Sum of n numbers is ---");
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }

        System.out.println(result);

        sc.close();
    }
}
