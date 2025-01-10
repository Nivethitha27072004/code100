import java.sql.SQLOutput;

public class ReverseNumber {
    public static void main(String[] args) {
        int  number =543;
        System.out.println(reverseNumber(number));
    }
     static int reverseNumber(int n){
         int rev = 0;
        while(n!=0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
         return rev;
    }
}
