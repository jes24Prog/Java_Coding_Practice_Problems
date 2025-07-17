package solution;

//Search in a Sorted 2D Matrix
//File: SearchMatrix.java
//Instructions: Search for a target value in a 2D matrix. Each row is sorted left to right, and each column top to bottom.
//Input: [[1,3,5],[7,9,11]], target = 9
//Output: true

public class SearchMatrix {

    public static boolean searchMatrix(int[][] arr, int target){

        boolean isFound = false;

        for (int[] i : arr) {
            int rows = i.length;
            for (int j : i) {
                if (target > i[rows - 1]) {
                    break;
                }
                if (target == j) {
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
        return isFound;
    }
}
