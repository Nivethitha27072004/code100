import java.util.Scanner;
//this not working learn parser int method.
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter the binary value:");
        int binaryDigit=1001;
        int decimalValue=0,temp,n=0;
        while(binaryDigit>=0){
            temp=binaryDigit%10;
            decimalValue=decimalValue+temp*(int)Math.pow(2,n);
            binaryDigit=binaryDigit/10;
            n++;
    }
        System.out.println("decimal value of given binary"+decimalValue);





}}
