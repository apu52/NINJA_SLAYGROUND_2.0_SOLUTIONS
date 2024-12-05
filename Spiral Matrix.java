import java.util.*;

public class Solution {
    public static int[] spiralMatrix(int[][] MATRIX) {
        List<Integer> result = new ArrayList<>();
        if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0];
        }

        int rows = MATRIX.length;
        int cols = MATRIX[0].length;

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                result.add(MATRIX[top][i]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                result.add(MATRIX[i][right]);
            }
            right--;

            if (top <= bottom) {
                
                for (int i = right; i >= left; i--) {
                    result.add(MATRIX[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                
                for (int i = bottom; i >= top; i--) {
                    result.add(MATRIX[i][left]);
                }
                left++;
            }
        }

        
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] MATRIX = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                MATRIX[i][j] = sc.nextInt();
            }
        }

        int[] result = spiralMatrix(MATRIX);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
