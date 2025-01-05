import java.util.Scanner;
import java.util.*;


public class PositiveAndNegative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PositiveAndNegative pn=new PositiveAndNegative();
        int number=sc.nextInt();
        pn.isPositiveOrNegative(number);
    }
    void isPositiveOrNegative( int num) {
        if(num>=0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }

    }
}

