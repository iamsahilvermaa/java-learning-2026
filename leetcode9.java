package java_roadmap;

import java.util.Scanner;

//palidrome number
public class leetcode9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0;
        int x1 = 0;
        //reversing a number


        int x2 = n;

        while(x2 != 0) {
            n1 = x2 % 10;
            x2 = x2 / 10;
            x1 = x1 * 10 + n1;

        }

//        System.out.println(x1);


        if(n >= 0) {
            if (n == x1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
        sc.close();

    }
}
