import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int expo=sc.nextInt();
       // System.out.println((int)Math.pow(base,expo));
        System.out.println(power(base,expo));

    }
    static int power(int num,int pow){
        int result=1;
        for(int i=1;i<=pow;i++){
        result=result*num;
    }
        return result;
}}
