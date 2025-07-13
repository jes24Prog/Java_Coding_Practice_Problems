package solution;

//Remove Duplicates from Sorted Array
//File: RemoveDuplicates.java
//Input: [1, 1, 2, 2, 3]
//Output: [1, 2, 3]

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] num) {
        Set<Integer> removeDuplicate = Arrays.stream(num).boxed().collect(Collectors.toSet());
        return removeDuplicate.stream().mapToInt(Integer::intValue).toArray();
    }

}
