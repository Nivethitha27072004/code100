import java.util.Scanner;

public class BubbleSort {
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
        sortedArray(newArray);

        sc.close();
    }

    private static void sortedArray(int[] newArray) {
        int n = newArray.length;

        // Bubble Sort algorithm (Ascending order)
        for (int i = n - 1; i > 0; i--) {
            boolean didSwap = false;

            // Inner loop for swapping
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) { // Ascending order check
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    didSwap = true;
                }
            }

            // If no swaps were made, the array is already sorted
            if (!didSwap) {//false.
                break;
            }
        }

        // Printing sorted array
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
