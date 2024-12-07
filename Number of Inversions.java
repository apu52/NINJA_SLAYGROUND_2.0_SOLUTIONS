public class Solution {
    
    
    public static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];
        
        
        System.arraycopy(arr, left, leftArray, 0, mid - left + 1);
        System.arraycopy(arr, mid + 1, rightArray, 0, right - mid);
        
        int i = 0, j = 0, k = left, invCount = 0;
        
        
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                invCount += (mid + 1) - (left + i); 
            }
        }
        
       
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }
        
        
        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
        
        return invCount;
    }

   
    public static int mergeSortAndCount(int[] arr, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            
            
            invCount += mergeSortAndCount(arr, left, mid);
            invCount += mergeSortAndCount(arr, mid + 1, right);
            
            
            invCount += mergeAndCount(arr, left, mid, right);
        }
        return invCount;
    }

    public static int numberOfInversions(int[] a, int n) {
        return mergeSortAndCount(a, 0, n - 1);
    }
    
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 1, 4};
        int n = a.length;
        System.out.println(numberOfInversions(a, n)); 
    }
}
