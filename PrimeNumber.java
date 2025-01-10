import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrimeNumber  pn=new PrimeNumber();
        int number =sc.nextInt();
        System.out.println(pn.isPrimeNumber(number));

    }
    boolean result=true;
    boolean isPrimeNumber(int num){
        if(num<=0){
            result=false;
        }
      for(int i=2;i<num/2;i++){
          if(num%i==0){
              result=false;
          }
      }return result;
    }

}
