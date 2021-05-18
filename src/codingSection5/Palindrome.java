package codingSection5;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println( isPalindrome( 9669 ) );
    }

    public static boolean isPalindrome(int number) {
         int n = number;

        if ( number == 0){
            return true;
        }
        if ( number < 0 ){
            return false;
        }

        int reversedInt =0 ;
        int pop ;

        while ( n != 0){
            pop = n % 10;
            n /= 10;

            reversedInt = ( reversedInt * 10) + pop;
        }


        if (reversedInt == number){
            return true;
        }

        else{
            return false;
        }
    }
}
