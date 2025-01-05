import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EvenOrOdd eo=new EvenOrOdd();
        int number =sc .nextInt();
        System.out.println(eo.isEvenOrOdd(number));

    }
    boolean isEvenOrOdd(int num){
        if(num%2==0){
          return true;
        }
        return false;

    }

}
