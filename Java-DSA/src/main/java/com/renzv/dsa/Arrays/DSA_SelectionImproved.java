package com.renzv.dsa.Arrays;

public class DSA_SelectionImproved {
    public static void main (String[] args) {

        int[] array = {54, 6, 65, 10, 12};
        int n = array.length;

        System.out.print("Unsorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        // Selects boundary between sorted and unsorted portions of the array 
        // For the first pass 1; i = 0 
        for (int i = 0; i < n - 1; i++) {
            // This keeps track if where the smallest value is found 
            int minIndex = i; // For each i it looks for the smallest value in the unsorted part 
            // Now the minIndex will be = 0

            // This finds the minimum value in the unsorted part 
            // Now this will loop through this part of the code where it finds the minimum value in 
            // the unsorted part

            // This will now compare if 6 < 54; since 6 < 54 update the minIndex to 1
            // And the algorithm continues
            // is 65 < 6 no
            // is 10 < 6 no
            // is 12 < 6 no

            for (int j = i + 1; j < n; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // This is where the swap happens
            // Swaps the minimum value with the current position 

            // Since minIndex = 1; which is = 6 
            int temp = array[i]; // The previous array[i] is stored here which is array[0] that is 54
            array[i] = array[minIndex]; // Now array[0] will be equal to array[1] which is 6. This is where the swap first occurs
            array[minIndex] = temp; // And we continue here to store the array[1] to temp, and that array[1] is 54
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i ++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        int[] array1 = {1, 6, 8, 54, 3};
        int m = array1.length;

        System.out.print("\nUnsorted array: ");
        for (int i = 0; i < m; i ++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < m - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < m; j ++) {
                if (array1[j] < array1[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array1[i];
            array1[i] = array1[minIndex];
            array1[minIndex] = temp;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(array1[i] + ", ");
        }
    }
}
