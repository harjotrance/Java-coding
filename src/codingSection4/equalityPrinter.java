package codingSection4;//Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//
//If one of the parameters is less than 0, print text "Invalid Value".
//
//If all numbers are equal print text "All numbers are equal"
//
//If all numbers are different print text "All numbers are different".
//
//Otherwise, print "Neither all are equal or different".
//
//
//EXAMPLES OF INPUT/OUTPUT:
//
//* printEqual(1, 1, 1); should print text All numbers are equal
//
//* printEqual(1, 1, 2); should print text Neither all are equal or different
//
//* printEqual(-1, -1, -1); should print text Invalid Value
//
//* printEqual(1, 2, 3); should print text All numbers are different


public class equalityPrinter {

    public static void main(String[] args) {
        printEqual( 23,23,63);
    }
    public static void printEqual(int firstParameter, int secondParameter, int thirdParameter) {
        if (firstParameter < 0 || secondParameter < 0 || thirdParameter < 0) {
            System.out.println("Invalid Value");
        } else {
            if (firstParameter == secondParameter) {
                if (secondParameter == thirdParameter) {
                    System.out.println("All numbers are equal");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            } else if (firstParameter == thirdParameter) {
                if (secondParameter == thirdParameter) {
                    System.out.println("All numbers are equal");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            } else if (secondParameter == thirdParameter) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");


            }
        }
    }
}
