package com.example.example;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56, 2, 97, 52, 23, 10, 22, 36, 55, 5};
        insertion(arr);
        printI(arr);
    }

    private static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void printI(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
