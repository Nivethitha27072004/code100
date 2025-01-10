import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        LeapYear ly=new LeapYear();
      Scanner sc=new Scanner(System.in);
      int year=sc.nextInt();
      ly.isLeapYear(year);

    }
    void isLeapYear(int num ){
        if(num%100==0){
            if(num%400==0){
                System.out.println("a leap");
            }
            else {
                System.out.println("not leap");
            }
        }
        else
        {
            if(num%4==0){
                System.out.println("a leap");
            }
            else {
                System.out.println("not leap");
            }
        }

        }
    }
