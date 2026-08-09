package java_roadmap;

import java.util.Scanner;

public class leetcode1108 {

    public String defangingIP(String address) {

       return address.replace(".", "[.]");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        leetcode1108 obj = new leetcode1108();

        System.out.println("Enter the string");
        String address = sc.nextLine();

        System.out.println(obj.defangingIP(address));

        sc.close();
    }
}
