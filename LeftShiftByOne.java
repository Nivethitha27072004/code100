public class LeftShiftByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
       leftShift(arr);

    }

    private static void leftShift(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }
}
