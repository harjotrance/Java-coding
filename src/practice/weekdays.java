package practice;
import java.util.Scanner;

public class weekdays {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number between 1 - 7 : ") ;
        //input
        int day = n.nextInt();
        String dayString;

        // switch statement with int data type
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
