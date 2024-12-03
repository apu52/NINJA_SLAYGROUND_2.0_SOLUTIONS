public class Solution {
    public static int upperBound(int[] arr, int x, int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }
}
