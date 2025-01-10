import java.util.Scanner;
public class PrimeBtwRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Strating_number=sc.nextInt();
        int final_number=sc.nextInt();
        for(int i=Strating_number;i<=final_number-1;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
     static boolean isPrime(int num){
        int result=0;
        if(num<2){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

    }
        return true;
}}
