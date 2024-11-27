import java.util.*; 

public class Solution {
    public static int[] getFrequencies(int[] v) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        
        for (int freq : frequencyMap.values()) {
            highestFreq = Math.max(highestFreq, freq);
            lowestFreq = Math.min(lowestFreq, freq);
        }
        
        
        int highestFreqElement = Integer.MAX_VALUE;
        int lowestFreqElement = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            
            if (freq == highestFreq) {
                highestFreqElement = Math.min(highestFreqElement, element);
            }
            if (freq == lowestFreq) {
                lowestFreqElement = Math.min(lowestFreqElement, element);
            }
        }
        
        return new int[] {highestFreqElement, lowestFreqElement};
    }
}
