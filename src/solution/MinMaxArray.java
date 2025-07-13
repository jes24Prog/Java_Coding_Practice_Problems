package solution;

//Find Largest and Smallest Element
//File: MinMaxArray.java
//Input: [3, 5, 1, 9, 2]
//Output: Min: 1, Max: 9


import java.util.Arrays;

public class MinMaxArray {

    public static int[] sortArray(int[] num){
        return Arrays.stream(num).sorted().toArray();
    }

    public static void minMaxArray(int[] num){
        int min = sortArray(num)[0];
        int max = sortArray(num)[num.length - 1];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
