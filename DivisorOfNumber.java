public class DivisorOfNumber {
    public static void main(String[] args) {
        int number=36;
        int count=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                count++;
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The number " + number +" will be divisible by "+count +" divisors");
    }
}
