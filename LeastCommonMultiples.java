import java .util.Scanner;


public class LeastCommonMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
    }
    static int getLcm1(int num1,int num2){
        int max=0;
        int lcm=0;
     //   max=num1>num2?num1:num2;
        max= Math.max(num1, num2);
        for(int i=max;i<num1*num2;i++){
            if(i%num1==0&&i%num2==0){
                lcm=i;
                break;

            }
        }
return lcm;
    }
    static int getLcm2(int num1,int num2){

    }
    static int findHcd(int num1,int num2){

    }
}
