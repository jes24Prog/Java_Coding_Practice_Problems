package solution;

//Generate All Subsets
//File: PowerSet.java
//Input: [1, 2]
//Output: [[], [1], [2], [1,2]]

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void backTrack(int start, int[] num, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));

        for(int  i = start; i < num.length; i++){
            current.add(num[i]);
            backTrack(i + 1, num, current ,result);
            current.removeLast();
        }
    }

    public static List<List<Integer>> powerSet(int[] num){
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, num, new ArrayList<>() ,result);
        return result;
    }
}
