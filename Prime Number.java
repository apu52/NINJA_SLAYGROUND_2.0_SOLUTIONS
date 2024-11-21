public class Solution {
    public static boolean isPrime(int n) {
        // If n is less than 2, it's not a prime number
        if (n < 2) {
            return false;
        }
        // Check divisors from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        // If no divisors were found, n is prime
        return true;
    }
}
