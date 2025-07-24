package com.renzv.dsa.Arrays;

// > greater than
// < less than
public class DSA_BubbleSort {
    public static void main (String[] args) {

        int[] num = {5, 3, 4, 6, 7, 56, 98, 78, 54};
        int n = num.length;

        System.out.print("Unsorted Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println("");

        for (int i = 0; i < n - 1; i++) { // Outer loop
            // Counts how many passes the program has done 

            for (int j = 0; j < n - i - 1; j++) { // Inner loop
                // Now this checks every adjecent elements of an array  
                // left to right 
                if(num[j] > num[j + 1]) { // Compare the value at index j to the value of index j + 1 
                    // This is where the comparing happen
                    // Lets say at position j, num[j] is 5 and num[j + 1] is 3. Since 5 > 3. they will be swapped 
                    // But the swaps really happened below

                    // Swap if left has a bigger value than right 
                    int temp = num[j]; // temp = 5 since num[j] is = 5. This holds the value 5 that acts as a checkpoint
                    num[j] = num[j + 1]; // Now as I explained earlier position num[j + 1] is 3 
                    num[j + 1] = temp; // Now, the two values have swapped places: 3 is on the left and 5 is on the right
                    // Making it sure that the bigger value moves to the right of the two compared elements 
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();

        int[] num1 = {10, 65, 49, 98, 78, 54};
        int f = num1.length;

        System.out.print("\nUnsorted Array: ");

        for(int i = 0; i < f; i++) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println("");

        for (int i = 0; i < f - 1; i++) {
            for (int j = 0; j < f - i - 1; j++) {
                if (num1[j] > num1[j + 1]) {
                    int temp = num1[j];
                    num1[j] = num1[j + 1];
                    num1[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < f; i++) {
            System.out.print(num1[i] + ", ");
        }
    }
}
