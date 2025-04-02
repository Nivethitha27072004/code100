import java.util.*;
class RemoveEvenInArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] myArray = new int[5];
        System.out.println("original array");
        for (int i=0;i<5;i++){
            myArray[i]=sc.nextInt();
        }
        System.out.println("array after removed even ");
        System.out.println(Arrays.toString(removeEven(myArray)));
    }
    static  int [] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int [] result=new int[oddCount];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }

}
