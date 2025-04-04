public class ReverseArrayRec {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr); // Print the reversed array
    }

    private static void reverseArray(int[] arr, int l, int r) {
        if (l >= r) { // n/2
            return;
        }
        swap(arr, l, r);
        reverseArray(arr, l + 1, r - 1);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for better formatting
    }
}