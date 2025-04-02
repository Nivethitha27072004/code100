import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int []myArray=new int[arraySize];
        for(int i=0;i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        System.out.println(findLargest(myArray));

    }
    static int findLargest(int [] arr) {
        int largest =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                largest = arr[i];
            }

        }
        return largest;
    }
}
