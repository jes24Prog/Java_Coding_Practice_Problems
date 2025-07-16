package solution;

//Kadane’s Algorithm (Max Subarray Sum)
//File: MaxSubarraySum.java
//Instructions: Find the maximum sum of a contiguous subarray.
//Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6


public class MaxSubarraySum {

    public static int maxSubArraySum(int[] arr){
        int maxSum = arr[0];
        int currentMax = 0;

        for(var x : arr){
            currentMax += x;
            maxSum = Math.max(maxSum, currentMax);
            currentMax = Math.min(currentMax, 0);
        }
        return maxSum;
    }
}
