public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        switch (ch) {
            case 1: 
                double r = a[0]; 
                return Math.PI * r * r; 

            case 2: 
                double l = a[0]; 
                double b = a[1]; 
                return l * b; 

            default:
                return 0.0; 
        }
    }
}
