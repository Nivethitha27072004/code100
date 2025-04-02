import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(findDigit(number));
    }
        static int findDigit(int n) {
            int countDigit=0;
            while(n>0){
                int lastDigit=n%10;
                countDigit++;
                n=n/10;
            }
            return countDigit;
        }
}
