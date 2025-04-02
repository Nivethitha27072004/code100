import java.util.Arrays;
import java.util.Scanner;
public class MiniValueArray {
    public static void main(String[] args) {
        System.out.println("this is originL Array");
        int []array_one={11,2,3,4,5,6};
        int result=findMin(array_one);
        System.out.println(result);
    }
    public static int findMin(int[]arr){
        int min=arr[0];
        if(arr==null||arr.length==0){
            System.out.println("now");
        }
        for(int i=0;i<arr.length;i++) {
            if (min > arr[i]) {
                min=arr[i];
            }
            }
        return min;
        }
}
