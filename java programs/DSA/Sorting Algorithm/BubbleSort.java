
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {78, 41, 33, 12, 2, 44, 100};
        printArr(arr);
        bubbleSort1(arr);
        printArr(arr);
//        System.out.println(Arrays.toString(arr));
    }


    private static void bubbleSort1(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
