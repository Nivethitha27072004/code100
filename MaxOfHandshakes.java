import java.util.*;
public class MaxOfHandshakes {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfppl=sc.nextInt();//in room.
       NoOfHandshakes(numberOfppl);
    }
    static void NoOfHandshakes(int number){
        //(number-1)+(number-1-1)+(number-1-1-1)+.....+1+0;
        int result=((number-1)*number)/2;
        System.out.println(result);
    }

}
