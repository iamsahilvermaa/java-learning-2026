package java_roadmap;

import java.util.Scanner;

public class ReverseNumberPattern {
        public void reverseNumberPattern(int n){
            for(int i=n; i>=1; i--) {
                for(int j=0; j<i; j++) {
                    System.out.print(j+1);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of digits");
            int n = sc.nextInt();

            ReverseNumberPattern rnp = new ReverseNumberPattern();
            rnp.reverseNumberPattern(n);

            sc.close();
        }
    }


