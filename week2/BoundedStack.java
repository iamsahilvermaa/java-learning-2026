package java_roadmap.week2;

import java.util.Scanner;

public class BoundedStack {

    int[] arr;
    int top;

    public BoundedStack(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (this.top == this.arr.length) {
            System.out.println("Stack Full");
        }
        this.top++;
        this.arr[this.top] = value;
    }

    public int pop() {
        if (this.top == -1) {
            System.out.println("Stack Empty");
        }
        int value = this.arr[this.top];
        this.top--;
        return value;
    }

    public int peek() {
        return this.arr[this.top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.arr.length - 1;
    }

    public void stackPrint() {
        for(int i = this.top; i >= 0; i--) {
            System.out.println(this.arr[i]);
        }
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items in the stack");
        int capacity = sc.nextInt();

        BoundedStack bs = new BoundedStack(5);

        System.out.println("Enter the items in the stack");



        while(capacity > 0) {
            int value = sc.nextInt();
            bs.push(value);
            capacity--;
        }

        System.out.println("Stack: ");
        bs.stackPrint();
    }
}
