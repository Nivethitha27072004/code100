import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                // System.out.println("enter the binary value:");
                int octalDigit=425;
                int decimalValue=0,temp,n=0;
                while(octalDigit>=0){
                    temp=octalDigit%10;
                    decimalValue=decimalValue+temp*(int)Math.pow(2,n);
                    octalDigit=octalDigit/10;
                    n++;
                }
                System.out.println("decimal value of given binary"+decimalValue);

            }}


