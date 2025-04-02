import java.util.Scanner;

import static java.lang.Math.min;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        System.out.println(getGcd(number1,number2));

    }

    private static int getGcd(int number1, int number2) {
        int gcd=1;
        for(int i=min(number1,number2);i>=1;i++){
            if(number1%i==0&&number2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }}
/*
    private static int getGcd(int number1,int number2) {
        while(number1>0 && number2>0){
            if(number1>number2)number1=number1%number2;
            else number2=number2%number1;
        }
        if(number1==0) return number2;
        else return number1;
    }

}
*/
