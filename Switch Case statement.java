public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        switch (ch) {
            case 1: // Area of a circle
                double r = a[0]; // Radius of the circle
                return Math.PI * r * r; // Return area of the circle

            case 2: // Area of a rectangle
                double l = a[0]; // Length of the rectangle
                double b = a[1]; // Breadth of the rectangle
                return l * b; // Return area of the rectangle

            default:
                return 0.0; // In case of invalid choice
        }
    }
}
