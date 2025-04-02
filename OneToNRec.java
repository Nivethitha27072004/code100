import java.util.Scanner;
public class OneToNRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int number1=sc.nextInt();
       int number2=sc.nextInt();


       System.out.println("result:");
      printValues1toN(number1,number2);


    }

    private static void printValues1toN(int number1, int number2) {
        if(number1>number2){
            return;
        }
        System.out.println(number1);
        printValues1toN(number1+1,number2);

    }


    private static void   printValues(int count) {
      if(count==5){
          return;
      }
      else{
      System.out.println(count);
      printValues(count+1);
    }}
}
