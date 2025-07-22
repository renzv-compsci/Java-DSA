package com.renzv.dsa.Arrays;

// Array is a data structure that store multiple elements.
// > greater than
// < less than 

public class DSA_Array {
    public static void main(String[] args) {
        
        int[] num = {4, 3, 56, 21, 5};
        int minVal = num[0];

        System.out.print("Elements of an array: ");

        // Uses enhance for loop 
        // Means that for each int i in num, the loops assigns i to the value of the next element. Means that in the first loop num[0] = 4 and num[1] = 3 and so on.
        for (int i : num) { 
            System.out.print(i + ", ");
        } 

        // // Uses traditional for loop 
        // for (int i = 0; i < num.length; i++){
        //     System.out.print(num[i] + ", ");
        // }
        System.out.println("");

        // Uses enhance for loop 
        // // As for this one same concept, so for each int i in num, the loops assigs i to the value of the next element.
        for (int i : num) { 
            if (i < minVal) { // Checks if the current value i < to the current mininum minVal
                minVal = i; // If yes minVal updates, until it reach all of the elements and finds the lowest
            }
        }

        // // // Uses traditional for loop 
        // for (int i = 0; i < num.length; i++) {
        //     if (num[i] < minVal) {
        //         minVal = num[i];
        //     }
        // }
        System.out.println("Lowest Value: " + minVal);

        System.out.println("");

        int[] maxNum = {5, 105, 65, 79, 98};
        int min = maxNum [0];

        System.out.print("Elements of Max Array: ");

        // // Using enhance for loop for printing all of the elements of an array
        for (int i : maxNum) {
            System.out.print(i + ", ");
        }

        // // Using traditional for loop 
        // for (int i = 0; i < maxNum.length; i++) {
        //     System.out.print(maxNum[i] + ", ");
        // }

        System.out.println("");

        // // Using enhance for loop 
        for (int i : maxNum) {
            if (i > min) {
                min = i;
            }
        }

        // // Using traditional for loop 
        // for (int i = 0; i < maxNum.length; i++) {
        //     if (maxNum[i] > min) {
        //         min = maxNum[i];
        //     }
        // }
        System.out.println("Highest Value: " + min);
    }
}
