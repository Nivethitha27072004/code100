import java.util.*;
public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingNumber = sc.nextInt();
        int finalNumber = sc.nextInt();
        int sum = 0;
        for (int i = startingNumber; i <= finalNumber; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
