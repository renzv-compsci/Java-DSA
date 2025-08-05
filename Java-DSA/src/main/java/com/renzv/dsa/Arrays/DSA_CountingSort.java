package com.renzv.dsa.Arrays;

public class DSA_CountingSort {
    public static void main (String[] args) {

        int[] array = {5, 5, 3, 3, 6, 5};
        countingSort(array);

        System.out.print("Sorted array: ");

        for (int num : array) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    // Static method that takes integer array as input 
    public static void countingSort(int[] array) {
        int maxValue = array[0]; // Initializes to the first value in the array 
        
        // This findsa the maximum element in the array 
        // Loop each num in array 
        for (int num : array) { 
            if(num > maxValue) { // If num is greater than maxValue, update maxValue 
                maxValue = num;
            }
        }

        // Declares a new integera array count of size maxValue + 1
        int[] count = new int[maxValue + 1]; // Stores the frequency of each integer value in array
        // E.g if maxValue is 6 the count array will have 7 slots (0-6)

        // Loops through each num in array 
        for (int num : array) {
            count[num]++;
        }

        // Use to write sorted values back into the array 
        int index = 0;
        
        // Loops through all possible values from i (0) to maxValue 
        for (int i = 0; i <= maxValue; i ++) {
            while(count[i] > 0) { 
                array[index++] = i; // Writes value to the array 
                count[i]--;
            }
        }
    }
}
