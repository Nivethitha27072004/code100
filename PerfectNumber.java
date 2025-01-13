import  java.util.*;

/*
input-->6 is perfect number
factor of 6 -->1+2+3=6

 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isPerfectNumber(number));
    }
    static boolean isPerfectNumber(int num){
        int temp=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
}
