package com.renzv.dsa.Arrays;

public class DSA_QuickSort {
    public static void main (String[] args) {

        int[] array1  = {5, 56, 9, 3, 15, 78};
        // Pass array1 as the array
        // 0 as the startinn index (low)
        // array1.length - 1; 5 as the ending index (high)
        // E.g Simulation: quicksort(array1, 0, 5)
        quicksort(array1, 0, array1.length - 1); // Calls the quicksort on the whole array (from index 0 to 5)

        System.out.print("Sorted array: ");
        for (int value : array1) {
            System.out.print(value + ", ");
        }
    }
    // Defines the recursive quicksort method with passing parameters 
    // array, the array to sort
    // low, the starting index 
    // high, the ending index 
    public static void quicksort(int[] array, int low, int high) {
        // Checks if the current subarray has more than one element; if not the recursion stops 
        if (low < high) { // if the condition is true 0 < 5; Calls partition method 

            // partition(array1, 0, 5) executes here 
            int pivotIndex = partition(array, low, high); // This calls the partition method to rearrang the subarray and find the pivots final index
            // And returns the pivot index in pivotIndex 
            quicksort(array, low, pivotIndex -1); // Sorts the left subarray before the pivot 
            quicksort(array, pivotIndex + 1, high); // Sorts the right subarray after pivot 
        }
    }

    // Defines partition method 
    // Receives the array and the current bounds low and high 
    public static int partition(int array[], int low, int high) {

        // pivot = array1[5] = 78
        int pivot = array [high]; // It selects the last element in the current subarray as the pivot 
        // i = - 1
        int i = low -1; // Initializes the i to one less than low; this marks the wall between smaller and larger elements 

        // Loops through the subarray from low to high - 1 with index j 
        // Loop j from 0 to 4
        for (int j = low; j < high; j++) { // Checks if the current element is less than or equal to the pivot 

            // array1[j] <= 78
            if (array[j] <= pivot) {
                i++; // Increment 

                // Swaps the element at j with element at i
                // Putting smaller elements to the left of the wall 
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp; // swap itselfst each time in this pass 
            }
        }

        // Swaps at pivot element high with the element right after the last smallest element i + 1 
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp; // After loop, swapp array1[i + 1] and array1[5] no change for pass 1
        return i + 1; // Returns the index of the pivot elements; Return 5
    }
} 