package com.example.example;


public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {78, 41, 33, 12, 2, 42, 100};
        System.out.println("Unsorted array: ");
        printArr(arr);
        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArr(arr);
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            //swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
