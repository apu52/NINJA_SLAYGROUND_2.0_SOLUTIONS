public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        
        for (int num : a) {
            
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }

            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }

        
        return new int[]{secondLargest, secondSmallest};
    }
}
