package solution;

//Transpose a Matrix
//File: TransposeMatrix.java
//Instructions: Transpose the given matrix (swap rows with columns).
//Input: [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]

import java.util.ArrayList;
import java.util.List;

public class TransposeMatrix {

    public static List<List<Integer>> transposeMatrix(int[][] num){
        List<List<Integer>> result = new ArrayList<>();

        int rows = num.length;
        int columns = num[0].length;

        for (int i = 0; i < columns; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                current.add(num[j][i]);
            }
            result.add(current);
        }

        return result;
    }
}
