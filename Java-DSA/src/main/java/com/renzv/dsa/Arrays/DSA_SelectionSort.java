package com.renzv.dsa.Arrays;
// > greater than 
// < less than
public class DSA_SelectionSort {
    public static void main(String[] args) {
        
        int[] array = {5, 6, 9, 54, 65, 23, 48, 78};
        int n = array.length;

        System.out.print("Unsorted Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) { // Outer loop
            int minIndex = i; // current position i 
            for (int j = i + 1; j < n; j++) { // Looks for the smallest value in the array
                if(array[j] < array[minIndex]) {
                    minIndex = j; // If smaller value is found, minIdex will be updated 
                }
            }
            int minValue = array[minIndex]; // Stores the minimum value found in an array
            // Makes space to minValue to insert at position i 
            for (int k = minIndex; k > i; k--) {
                array[k] = array[k -1];
            }
            array[i] = minValue; // Plae the minimum value at its correct sorted position
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
