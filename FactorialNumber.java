public class FactorialNumber {
    public static void main(String[] args) {
        int number=5;
        System.out.println( factorial(number));
    }
    static int factorial(int number){
        if(number==0)return 1;
        else
            return number*factorial(number-1);

    }
}
