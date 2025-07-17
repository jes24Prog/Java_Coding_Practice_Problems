package solution;

//Spiral Order Matrix Traversal
//File: SpiralMatrix.java
//Instructions: Print all elements of a matrix in spiral order.
//Input: [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]

//[1,2,3]
//[4,5,6]
//[7,8,9]


//(0,0) (0,1) (0,2)
//(1,0) (1,1) (1,2)
//(2,0) (2,1) (2,2)


public class SpiralMatrix {

    public static int[] spiralTracing(int area, int length, int width, int[] directionX, int[] directionY, int x, int y, int movement, int[][] arr){
        int[] spiralResult = new int[area];
        boolean[][] visited = new boolean[length][width];

        for(int i = 0; i < area; ++i){
            spiralResult[i] = arr[x][y];
            visited[x][y] = true;

            int newX = x + directionX[movement];
            int newY = y + directionY[movement];

            if(0 <= newX && newX < length && 0 <= newY && newY < width && !visited[newX][newY]){
                x += directionX[movement];
                y += directionY[movement];
            }else{
                movement = (movement + 1) % 4;

                x += directionX[movement];
                y += directionY[movement];
            }
        }


        return spiralResult;
    }


    public static int[] spiralMatrix(int[][] arr){
        int length = arr.length;
        int width = arr[0].length;
        int area = length * width;

        int[] directionX = {0,1,0,-1};
        int[] directionY = {1,0,-1,0};


        return spiralTracing(area, length, width, directionX, directionY, 0, 0, 0, arr);
    }
}
