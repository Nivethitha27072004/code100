import java.util.Arrays;
import java.util.Scanner;

public class MaxValueArray {
        public static void main(String[] args) {
            System.out.println("this is originL Array");
            int []array_one={11,2,3,4,5,6};
            int result=findMax(array_one);
            System.out.println(result);
        }
        public static int findMax(int[]arr){
            int max=arr[0];
            if(arr==null||arr.length==0){
                System.out.println("now ");
            }
            for(int i=0;i<arr.length;i++) {
                if (max< arr[i]) {
                    max=arr[i];
                }
            }
            return max;
        }
    }


