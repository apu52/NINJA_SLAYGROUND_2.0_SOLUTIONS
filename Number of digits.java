public class Solution {
    public static int countDigits(int n){
        return String.valueOf(Math.abs(n)).length();
    }
}
