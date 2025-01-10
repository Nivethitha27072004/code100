import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int reversed_number=isPalindrome(number);
        if(number==reversed_number){
            System.out.println("palindrome");;
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    static int isPalindrome(int n){
        int rev = 0;
        while(n!=0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
    }return rev;
}}
