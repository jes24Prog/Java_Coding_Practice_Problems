package solution;

//Binary Search
//File: BinarySearch.java
//Input: [1, 3, 5, 7], target = 5
//Output: Index: 2

public class BinarySearch {
    public static int binarySearch(int[] num, int target){
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >>> 2);

            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
