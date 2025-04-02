import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  [] arr=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        FindFreq(arr,n);
    }

    private static void  FindFreq(int[] arr,int n) {
        boolean[]visitor =new boolean[n];
        int  count=1;
        int i;
        for(i=0;i<n;i++){
            if(visitor[i]==true){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) {
                    visitor[j] = true;
                    count++;

                }
            }System.out.println(arr[i]+" "+count);

        }

    }
}
