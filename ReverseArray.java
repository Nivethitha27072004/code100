import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args) {

     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int arraySize = sc.nextInt();
        int[] myArray = new int[arraySize];
        System.out.println("enter the value of the array:");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("reversed array of given:");
        System.out.println(Arrays.toString(reverseArray(myArray, 0, myArray.length - 1)));

    }}


    static int[] reverseArray(int array[],int start ,int end){
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }

    }

