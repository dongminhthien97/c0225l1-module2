package ss14_Sort_Algorithm.InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            displayArr(arr);
        }

    }
    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting: ");
        displayArr(arr);

        InsertionSort(arr);

        System.out.println("Array after sorting: ");
        displayArr(arr);
    }
}
