/*
21/(2+1)-->21/7-->7

 */
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isHarshadNUmber(number));

    }
    static boolean isHarshadNUmber(int number){

        int sum=0,temp=number,digit;
        while(number!=0){
            digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        if(temp%sum==0){
            return true;
        }
        return false;
    }
}
