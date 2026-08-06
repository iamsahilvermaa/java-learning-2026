package java_roadmap;

import java.util.Scanner;


//Sum and Product of n
public class leetcode1281 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int x1 = 0;
        int x2 = 1;

        if(n == 0) {
            x2 = 0;
        }

        while(n != 0) {
            int n1 = n%10;
                n = n / 10;
                 x1 = x1+n1;
                 x2 = x2*n1;

        }
        System.out.println("SUM: " + x1);
        System.out.println("Product: " + x2);

        sc.close();
    }
    }