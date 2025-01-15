import java.util.Scanner;
public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        System.out.println(findHighestCommonFactor(number1,number2));
        System.out.println(findHighestCommonFactor2(number1,number2));
    }
    //method one........................................

    static int findHighestCommonFactor(int num1,int num2){
        int hcf=0;
        for(int i=1;i<num1|| i<num2;i++){
            if(num1%i==0&&num2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    static int findHighestCommonFactor2(int num1,int num2){
        int hcf=0,min=0;
        //min= Math.min(num1, num2);
        min =num1<num2?num1:num2;
        for(int i=1;i<=min;i++){
            if(num1%min==0&&num2%min==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
