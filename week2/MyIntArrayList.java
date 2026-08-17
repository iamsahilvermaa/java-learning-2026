package java_roadmap.week2;

import java.util.Arrays;
import java.util.Scanner;

public class MyIntArrayList {

    int[] list = new int[2];
    int size = 0;


    public void add(int element) {
        if (size == list.length) {
            int[] newArr = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = list[i];
            }
            list = newArr;
        }
        list[size] = element;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public int getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return list[index];
    }

    public int removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int removed = list[index];

        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyIntArrayList list = new MyIntArrayList();

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.print("Original list: ");
        list.print();

        System.out.println("\nSize: " + list.size());

        System.out.print("Enter index to remove: ");
        int removeIndex = sc.nextInt();

        int removed = list.removeElement(removeIndex);

        System.out.println("Removed value: " + removed);

        System.out.print("After removal: ");
        list.print();

        System.out.println("\nSize: " + list.size());

        sc.close();
    }
}
