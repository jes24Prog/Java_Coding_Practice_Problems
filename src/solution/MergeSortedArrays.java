package solution;

//Merge Two Sorted Arrays
//File: MergeSortedArrays.java
//Instructions: Merge two sorted arrays into one sorted array.
//Input: [1,3,5], [2,4,6]
//Output: [1,2,3,4,5,6]

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArrays {

    public static int[] sort(int[] num){
        return Arrays.stream(num).sorted().toArray();
    }

    public static int[] mergeSortedArrays(int[] num1, int[] num2){
        int[] merge = IntStream.concat(Arrays.stream(num1), Arrays.stream(num2)).toArray();
        return sort(merge);
    }
}
