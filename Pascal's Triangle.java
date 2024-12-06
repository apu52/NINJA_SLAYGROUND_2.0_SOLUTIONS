import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            
            
            row.add(1L);

            
            for (int j = 1; j < i; j++) {
                long value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                row.add(value);
            }

           
            if (i > 0) {
                row.add(1L);
            }

            
            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }

    
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine().trim());

        while (T-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            ArrayList<ArrayList<Long>> result = printPascal(n);

            
            for (ArrayList<Long> row : result) {
                for (Long value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

