import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int number=sc.nextInt();
        int nextDigit;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=number;i++){
            nextDigit=a+b;
            System.out.print(nextDigit+" ");
            a=b;
            b=nextDigit;

        }

    }

}
