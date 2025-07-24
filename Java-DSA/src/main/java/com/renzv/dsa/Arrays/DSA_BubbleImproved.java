package com.renzv.dsa.Arrays;
// > greater tham
// < less than
public class DSA_BubbleImproved {
    public static void main (String[] args) {

        int[] array = {1, 2, 3, 6, 5};
        int n = array.length;

        System.out.print("Unsorted Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        } 
        System.out.println("");

        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true; // Declaration that a swap happened 
                }
            }
            if (!swap) {
                break; // If no swap are made it means the array is already sorted
                // The algorithm will stop early 
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }
}
