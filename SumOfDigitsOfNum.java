import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SumOfDigitsOfNum sn=new SumOfDigitsOfNum();
        int n=sc.nextInt();
        System.out.println(sn.sumOfDigits(n));

    }
    int sumOfDigits(int i){
        int sum=0;
        while(i!=0){
        /*   sum+=(i%10);
           i=i/10;
*/
            int rev=i%10;
            sum=sum+rev;
            i=i/10;
        }
        return sum;

    }
}
