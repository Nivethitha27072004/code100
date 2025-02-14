import java.util.Scanner;
public class isHappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println( isHappy(number));
    }
        public static boolean isHappy(int n) {
            if(n==1||n==7)
                return true;
            else if(n<10) return false;
            else{
                int sum=0;
                while(n>0){
                    int unitDigit=n%10;
                    int square=(unitDigit*unitDigit);
                    sum=sum+square;
                    n=n/10;
                }
                return isHappy(sum);
            }
        }}

