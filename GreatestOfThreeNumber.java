import java.util.*;
public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number_1=sc.nextInt();
        int number_2=sc.nextInt();
        int number_3=sc.nextInt();
        if(number_1<number_2){//10>11
            if(number_2<number_3){
                System.out.println("number 3 is greater"+number_3);
            }
            else{
                System.out.println("number 2 is greater"+number_2);
            }
        }
        else{
            System.out.println("number 1 is greater"+ number_1);
        }
    }
}
