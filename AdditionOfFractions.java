import java.util.Scanner;
public class AdditionOfFractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1,den=1,x;
        System.out.println("enter the values");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int den1=sc.nextInt();
        int den2=sc.nextInt();
        if(den1==den2){
           num=num1+num2;
           den=den1;
        }
        else{
            num=(num1*den2)+(num2*den1);
            den=(den1*den2);
        }
        if(num>den){
            x=num;
        }
        else{
            x=den;
        }
        for(int i=1;i<=x;i++){
            if(num%i==0&&den%i==0){
                num=num/i;
                den=den/i;
            }
        }
        int n=1;
        int p=num,q=den;
        if(num!=den){
            while(n!=0){
                n=num%den;
                if(n!=0){
                    num=den;
                    den=n;
                }
            }
        }
        System.out.println("("+p/den+"/"+q/den+")");
    }
}
