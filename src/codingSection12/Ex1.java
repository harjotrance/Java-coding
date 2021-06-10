package codingSection12;
import java.util.*;


public class Ex1 {


        public static void main(String args[])
        {

            Map<Integer, String> hm1 = new HashMap<>();


            Map<Integer, String> hm2
                    = new HashMap<Integer, String>();


            hm1.put(1, "Geeks");
            hm1.put(2, "For");
            hm1.put(3, "Geeks");

            hm2.put(new Integer(1), "Geeks");
            hm2.put(new Integer(2), "For");
            hm2.put(new Integer(3), "Geeks");

            System.out.println(hm1);
            System.out.println(hm2);
        }
}
