import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.println("After sorting");
        sortedArray(arr);
    }

    private static void  sortedArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}


