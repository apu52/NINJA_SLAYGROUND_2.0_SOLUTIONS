import java.util.* ;
import java.io.*; 

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0:
                    
                    Collections.swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    
                    Collections.swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }
}
