import java.util.HashSet;

public class Solution {
    public static String read(int n, int[] book, int target) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        
        for (int pages : book) {
            
            if (seen.contains(target - pages)) {
                return "YES";
            }
            
            seen.add(pages);
        }
        
        
        return "NO";
    }
}
