import java .util.Scanner;


public class LeastCommonMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println(getLcm1(number1,number2));
        System.out.println(getLcm2(number1,number2));
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
       // int lcm=0;
        int hcf=findHcf(num1,num2);
       int lcm=(num1*num2)/hcf;
        return lcm;
    }
    static int findHcf(int num1,int num2){
        int hcf=1;
        for(int i=1;i<=num1||i<=num2;i++){
            if(i%num1==0&&i%num2==0){
                hcf=i;
            }
        } return hcf;
    }
}
