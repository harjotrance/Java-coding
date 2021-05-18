package codingSection5;

public class LargestPrime {

    public static void main(String[] args)
    {
        long n = 346465734653456l;
        System.out.println(maxPrimeFactors(n));
    }

    static long maxPrimeFactors( long n)
    {

        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;

            n >>= 1;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }

        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }

}
