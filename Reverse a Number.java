public class Solution {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10; 
            reversed = reversed * 10 + digit; 
            n /= 10; 
        }
        return reversed;
    }
}
