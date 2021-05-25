package codingSection8;

import java.util.Arrays;
import java.util.Scanner;

public class sortedArray {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger = getInteger(6);

        for(int i= 0 ; i < myInteger.length ; i++){

            Arrays.sort(myInteger);
            System.out.println("the value is " + myInteger[i] );

        }

    }

    public static int [] getInteger(int number){
        System.out.println("Enter "+ number + " Integer values. \r"  );
        int [] values = new int[number];

        for (int i=0 ; i< values.length ; i++ ){
            values[i] = in.nextInt();
        }
        return values;
    }
}
