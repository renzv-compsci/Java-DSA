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

        for (int i = 0; i < n - 1; i++) { // Outer loop: Sets the currrent boundary between sorted and unsorted
            // Lets say pass 1 (i=0) the unsorted part is the initial array which is {5, 6, 9, 54, 65, 23, 48, 78}
            // Since the minIndex is = i and i is = 0 the minIndex as of the moment is 5
            // Now this checks all of the array if i = 0 is smaller than other indeces 
            // But if minIdex == i there is no need for shifting 
            // Now this well result to {5, 6, 9, 54, 65, 23, 48, 78} as being being the sorted part and the rest is unsorted

            // Now for pass 2 (i=1) that is 6
            // Now since i = 1 the minIndex now will be = 1 which is 6 as its current value 
            // Now this will check its corresponding value or next value which is 9
            // Now if 6 is < 9 they will swap, but they are not, so the algorithm continues
            // Since 6 is the lowest value among the unsorted array the array[i] will be 6 
            // And the result of the current array will be {5, 6, 9, 54, 65, 23, 48, 78}

            int minIndex = i; // This assumes the smallest value is at the current position i
            for (int j = i + 1; j < n; j++) { // Inner looop: This looks for the smallest value in the array in the unsoted array
                if(array[j] < array[minIndex]) {
                    minIndex = j; // Now if a smaller values is found in an array, it will store it in the minIndex
                }
            }

            int minValue = array[minIndex]; // Stores the minimum value found in an unsorted array
            // You do this because you will overwrite the array

            // This loop shifts all element between index i and minIndex one position to the right 
            for (int k = minIndex; k > i; k--) { // But k > 1 means that it will stop when k==5
                array[k] = array[k - 1];
            }
            array[i] = minValue; // Place the minimum value at its correct sorted position
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        int[] array1 = {1, 6, 5, 4,};
        int m = array1.length;

        System.out.print("\nUnsorted array: ");

        for (int i = 0; i < m; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println("");

        for (int i = 0; i < m - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < m; j++) {
                if (array1[j] < array1[minIndex]) {
                    minIndex = j;
                }
            }
            int minValue = array1[minIndex];
            for (int k = minIndex; k > i; k--) {
                array1[k] = array1[k - 1];
            }
            array1[i] = minValue;
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
    }
}
