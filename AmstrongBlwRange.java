import java.util.*;
public class AmstrongBlwRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range:");
        int first_digit=sc.nextInt();
        int second_digit=sc.nextInt();
        for(int i=first_digit;i<=second_digit;i++){
            int len=getDigits(i);
            int result=isPalindrome(i,len);
            if (i == result) {
                System.out.println(i);
            }
        }
    }
    static  int getDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }return count;
    }
    static int isPalindrome(int num,int len){
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp=temp/10;
        }return sum;
    }
}
