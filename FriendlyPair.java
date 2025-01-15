/*

 */
import java .util.Scanner;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number_one=sc.nextInt();
        int number_two=sc.nextInt();
        int A=getSumOfDivisor(number_one);
        int B=getSumOfDivisor(number_two);
        if(A%number_one==B%number_two){
            System.out.println("friendly pair");
        }
        else{
            System.out.println("not friendly pair");
        }

    }
    static int getSumOfDivisor(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }

}