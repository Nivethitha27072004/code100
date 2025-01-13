/*
145=1!+4!+5!-->145
then its strong number.

 */


import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int result=isStrongNumber(number);
        if(number==result){
            System.out.println(number + " is a Strong Number");
        }
        else {
            System.out.println(number + " is not a Strong Number");
        }
    }
    static int getfactorial(int num){
        if(num==0||num==1){
            return 1;
        }
       return num*getfactorial(num-1);
    }
    static int isStrongNumber(int num){
        int sum=0;
        while(num!=0) {
            int digit = num % 10;
            sum = sum + getfactorial(digit);
            num = num / 10;
        }
        return sum;
    }

}
