import java.util.*;
public class InputandOutputOfArray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int sizeOfArray=sc.nextInt();
            int [] arrayOne=new int[sizeOfArray];
            //Syntax of array:datatype [] arrayName=new datatype[size];
            System.out.println("Enter the value of array");
            for(int i=0;i<sizeOfArray;i++){
                //to get the value of array.
                arrayOne[i]=sc.nextInt();

            }
            System.out.println("values of array");
            for(int i=0;i<sizeOfArray;i++){
                // to print the values of array.
                System.out.print(+arrayOne[i]+" ");
            }
            System.out.println(" ");
            System.out.println("to update one value in array");
            arrayOne[3]=78;
            //updating the array.
            System.out.println("updated array");
            for(int i=0;i<sizeOfArray;i++){
                // to print the values of array.
                System.out.print(+arrayOne[i]+" ");
            }
            System.out.println(" ");


        }
    }


