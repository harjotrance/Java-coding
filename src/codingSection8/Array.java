package codingSection8;
import java.util.Scanner;

public class Array {
   private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger = getInteger(6);

        for(int i= 0 ; i < myInteger.length ; i++){
            System.out.println("Position " + i + "the value is " + myInteger[i] );


        }
        System.out.println("the average is " + getAverage( myInteger ) );
    }

    public static int [] getInteger(int number){
        System.out.println("Enter "+ number + " Integer values. \r"  );
        int [] values = new int[number];

        for (int i=0 ; i< values.length ; i++ ){
            values[i] = in.nextInt();
        }
      return values;
    }

    public static double getAverage (int [] array){
        int sum =0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum /  (double) array.length;
    }


}
