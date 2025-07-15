package solution;

//Find All Pairs with Given Sum
//File: PairSum.java
//Instructions: Find all unique pairs in the array that sum up to a given target.
//Input: [1, 2, 3, 4, 5], sum = 6
//Output: [(1,5), (2,4)]

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    public static List<List<Integer>> pairSum(int[] num, int sum){

        List<List<Integer>> pair = new ArrayList<>();

        for(int i = 0; i < num.length - 1; i++){
            List<Integer> current = new ArrayList<>();

            //add first pair
            current.add(num[i]);
            //find the pair
            for (int k = i; k < num.length; k++) {
                if(num[i] == num[k]) continue;
                if ((num[i] + num[k]) == sum) {
                    current.add(num[k]);
                    pair.add(current);
                    break;
                }
            }
        }

        return pair;
    }
}
