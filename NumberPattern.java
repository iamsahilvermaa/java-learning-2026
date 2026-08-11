package java_roadmap;

import java.util.Scanner;

public class NumberPattern {

        public void numberPattern(int n){
            for(int i=0; i<n; i++) {
                for(int j=0; j<=i; j++) {
                    System.out.print(j+1);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of digits");
            int n = sc.nextInt();

        NumberPattern np = new NumberPattern();
        np.numberPattern(n);

            sc.close();
        }
    }

