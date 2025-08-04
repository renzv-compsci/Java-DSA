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

    public static void countingSort(int[] array) {
        int maxValue = array[0];
        
        for (int num : array) {
            if(num > maxValue) {
                maxValue = num;
            }
        }

        int[] count = new int[maxValue + 1];

        for (int num : array) {
            count[num]++;
        }

        int index = 0;
        
        for (int i = 0; i <= maxValue; i ++) {
            while(count[i] > 0) { 
                array[index++] = i;
                count[i]--;
            }
        }
    }
}
