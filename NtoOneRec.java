import java.util.Scanner;

public class NtoOneRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int startingNumber=sc.nextInt();
        int endNumber=sc.nextInt();
       int result= printNumber(startingNumber,endNumber);
        System.out.println(result);

    }
    /*
     static int sum=0;
    private static int printNumber(int startingNumber, int endNumber) {

        if(startingNumber<endNumber){
            return 0;
        }
        sum=sum+startingNumber;
        printNumber(startingNumber-1,endNumber);
        return sum;
    }
*/
    private static int printNumber(int startingNumber,int sum){

        if(startingNumber<0){
            return sum;
        }

        return  printNumber(startingNumber-1,sum+startingNumber);


    }


}
