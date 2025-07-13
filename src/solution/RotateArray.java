package solution;

//Rotate Array by K Steps
//File: RotateArray.java
//Input: [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]

public class RotateArray {

    private static void reverse(int[] num, int start, int end) {
        for(int i = start; i < end; i++){
            int temp = num[start];
            num[start++] = num[end];
            num[end--] = temp;
        }
    }


    public static int[] rotateArray(int[] num, int k){

        reverse(num, 0, num.length - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, num.length - 1);

        return num;

    }
}
