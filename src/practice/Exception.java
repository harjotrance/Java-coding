package practice;
import java.io.*;

public class Exception {


        public static void main(String[] args) {
// Read input from STDIN; write output to STDOUT.
            String s1="12";
            int s2=12;
            try
            {
                s2="a";
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            catch(NullPointerException e1)
            {
                System.out.println(e1.toString());
            }
            catch(NumberFormatException e2)
            {
                System.out.println(e2.toString());
            }

    }
}
