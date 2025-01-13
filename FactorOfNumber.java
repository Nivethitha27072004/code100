import java.util.*;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        getFactors(number);

    }
    static void  getFactors(int num){
        for(int i=1;i<=num;i++) {//(num/2)-->condition alter.
            if (num % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
