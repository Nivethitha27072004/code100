import java.util.Scanner;
public class WhichQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0&&y>0){
            System.out.println("quadrant one");
        } else if (x>0&&y<0) {
            System.out.println("quadrant four");
        } else if (x<0&&y<0) {
            System.out.println("quadrant three");

        } else if (x<0&&y>0) {
            System.out.println("quadrant two");
        }
        else{
            System.out.println("the point not lies in the quadrants");
        }
    }
}
