package com.renzv.dsa.Arrays;

public class DSA_InsertionSort {
    public static void main (String[] args) {

        int [] array = {5, 3, 4, 6, 9};
        int n = array.length;

        System.out.print("Unsorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        // Outer Loop 
        for (int i = 1; i < n; i++) { // It started to i = 1 since 5 is already considered as a part of the sorted value 
            // Pas 1 (1 = 1)
            // i = 0 (5) already sorted out 
            // For i = 1 (3); 
            // The algorithm start comparing elements in the sorted from right to left 
            // We compare 3 to 5 since 3 < 5 at index j = 0
            // Shifts 5 to the right; array[1] = array[0]

            // Tracks where the current value will be inserted 
            int insertIndex = i; // We update insert index to 0 

            // This is the value to be inserted into the sorted which is for pass 1 that is 3 
            int currentValue = array[i]; // The current value that needs to be inserted into its correct position 

            // Starts comparing from the last element of the sorted portion to the unsorted portion 
            int j = i -1; // From index 0 to i - 1
            
            // Inner Loop
            // Shifts element in the sorted portion to the right if they are greater than the current value 
            while (j >= 0 && array[j] > currentValue) { 
                array[j + 1] = array[j]; // Moves the larger element one position to the right 
                insertIndex = j; // Update the insertion index to the current position 
                j--; // and move to the next element by decrementing to -1 and exiting the loop 
            }
            // Now it will insert the current value to its correct position 
            // Now the pass 1 array is now [3, 5, 4, 6, 9]
            array[insertIndex] = currentValue;
        }
        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();

        int[] array1 = {9, 11, 65, 54};
        int m = array1.length;

        System.out.print("\nUnsorted Array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        for (int i = 1; i < m; i++) {  

            int insertIndex = i;
            int currentValue = array1[i]; 
            int j = i - 1;

            while (j >= 0 && array1[j] > currentValue) {
                array1[j + 1] = array1[j];
                insertIndex = j;
                j--;
            }
            array1[insertIndex] = currentValue;
        }

        System.out.print("Sorted Value: ");
        for (int value : array1) {
            System.out.print(value + ", ");
        }
    }
}
