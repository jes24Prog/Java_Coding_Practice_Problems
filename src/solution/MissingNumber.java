package solution;

//Find Missing Number
//File: MissingNumber.java
//Input: [1, 2, 4, 5], n = 5
//Output: 3


public class MissingNumber {

    public static int missingNumber(int[] num, int size){
        int totalSum = size * (size + 1) / 2;
        int arraySum = 0;
        for (int n : num) {
            arraySum += n;
        }

        int missingNum = totalSum - arraySum;;

        return missingNum;
    }

}
