import java.util.Arrays;
import java.util.*;
public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[6];
        for(int i=0;i<6;i++){
             array [i]=sc.nextInt();
        }
        int value=sc.nextInt();
        int result=linearSearch( array, value);
        System.out.println("the serching element is present in:"+result);
    }
    //array startes in0;
    public static int linearSearch(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

}
