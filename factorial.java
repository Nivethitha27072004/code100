public class factorial {
    public static void main(String[] args) {
        int number=0;
        System.out.println( factorial(number));


    }
    private static int factorial(int fact){
        if(fact<=1){
            return 1;//factorila of 0 and 1 is 1
        }
       fact=fact*factorial(fact-1);
        return fact;
    }
}
