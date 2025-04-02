import java.util.Scanner;
import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting the size of the array
        int arraySize = sc.nextInt();
        int newArray[] = new int[arraySize];

        // Reading array elements
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = sc.nextInt();
        }

        // Printing before sorting
        System.out.println("Before sorting:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // Sorting and printing the result
        System.out.println("After sorting:");
        mergeSort(newArray, 0, arraySize - 1);  // Fixed argument passing
        for (int i = 0; i < arraySize; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    private static void mergeSort(int[] newArray, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(newArray, low, mid);
        mergeSort(newArray, mid + 1, high);
        mergeArray(newArray, low, mid, high);
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary array
        int left = low;      // Starting index of left half
        int right = mid + 1; // Starting index of right half

        // Merging two halves into temp array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Adding remaining elements from left half
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Adding remaining elements from right half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copying sorted elements back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
