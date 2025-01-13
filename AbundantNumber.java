/*
sum of factors of 18=1+2+3+6+9=21
21>18-->true.
sum of proper divisors>number.
 */
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       int result=getSumOfFactors(number);
       if(result>number){
           System.out.println("abundant number");
       }
       else System.out.println("not Abundant number");
    }
    static int getSumOfFactors(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
