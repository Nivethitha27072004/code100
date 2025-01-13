/*
5*5=25
5=5(unit digit of square);


 */

import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isAutomorphic(number));

    }
    static boolean isAutomorphic(int num){
        int square=num*num;
        if(square%10==num%10){
            return true;
        }
        return false;
    }
}
