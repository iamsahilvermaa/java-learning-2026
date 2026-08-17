package java_roadmap.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OrderingSystem {
        private String[] stream;
        private int ptr;

        public OrderingSystem(int n) {
            stream = new String[n+1];
            ptr = 1;
        }

        public List<String> insert(int keyId, String value) {
            stream[keyId] = value;
            List<String> result = new ArrayList<>();

            while(stream[ptr] != null) {
                result.add(stream[ptr]);
                ptr++;
            }
                return result;
        }
}

    public class OrderingSystem1656 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items you want to order:");
        int n = input.nextInt();

        OrderingSystem os = new OrderingSystem(n);

        System.out.println("---Ordering System---");
        System.out.println(os.insert(1, "ccccccc"));
        System.out.println(os.insert(2, "bbbbb"));
        System.out.println(os.insert(4, "eeeeeeee"));
        System.out.println(os.insert(3, "dddddddd"));
        System.out.println(os.insert(5, "fffffff"));

        input.close();

    }


    }
