public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int low = 0;
        int high = n;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] < x) {
                low = mid + 1; 
            } else {
                high = mid; 
            }
        }
        
        return low; 
    }
}
