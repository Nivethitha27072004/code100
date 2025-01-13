import java.util.Scanner;
import java.lang.Math;
public class AmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int len=countDigits(number);
        System.out.println(isAmstrongNumber(number,len));
    }
    static int countDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }return count;
    }
    static boolean isAmstrongNumber(int num, int len){
        int sum=0;
        int temp=num;
        while (temp!=0){
            int digit=temp%10;
            sum+=(int)Math.pow(digit,len);
            temp/=10;
        }
     return sum==num;
    }
}


