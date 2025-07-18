package solution;

//Majority Element (> n/2 times)
//File: MajorityElement.java
//Instructions: Find the element that appears more than ⌊n/2⌋ times.
//Input: [2,2,1,1,1,2,2]
//Output: 2

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] arr){

        Map<Integer, Integer> occurrence = new HashMap<>();
        int element = 0;

        for(int i : arr){
            occurrence.put(i, occurrence.getOrDefault(i, 0) + 1);
        }

        for(var i : occurrence.entrySet()){
            if(element <=  i.getValue()){
                element = i.getKey();
            }
        }

        return element;
    }
}
