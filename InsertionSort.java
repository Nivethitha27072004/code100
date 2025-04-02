//takes the an elament place in correct position swapped unlit the
//found there cortet position.


import java.util.Scanner;
public class InsertionSort {
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
        sortedAarry(arr);
    }

    private static void sortedAarry(int []arr) {
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
