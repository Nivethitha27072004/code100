
import java.util.Scanner;
public class CountOfOddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int oddCount=0,evenCount=0;
        System.out.println("enter sizeof array:");
        int sizeofArray=sc.nextInt();
        int [] arr=new int[sizeofArray];
        System.out.println("enter value of array");
        for(int i=0;i<sizeofArray;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
            else{
                evenCount++;
            }
        }
        System.out.println("odd Count="+oddCount);
        System.out.println("even Count="+evenCount);
    }
}


