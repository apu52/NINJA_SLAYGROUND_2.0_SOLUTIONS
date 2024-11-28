import java.util.*; 
import java.io.*; 

public class Solution {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        
        Collections.reverse(arr);

        int carry = 1; 
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);
            carry = sum / 10;
        }

        
        if (carry > 0) {
            arr.add(carry);
        }

        
        Collections.reverse(arr);

        
        while (arr.size() > 1 && arr.get(0) == 0) {
            arr.remove(0);
        }

        return arr;
    }
}
