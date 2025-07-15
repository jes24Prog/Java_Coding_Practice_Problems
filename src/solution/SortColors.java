package solution;

//Sort Array of 0s, 1s, and 2s (Dutch National Flag Problem)
//File: SortColors.java
//Instructions: Sort an array containing only 0s, 1s, and 2s without using any sorting function.
//Input: [2, 0, 2, 1, 1, 0]
//Output: [0, 0, 1, 1, 2, 2]


public class SortColors {

    public static int[] sortColors(int[] num){
        for(int i = 0; i < num.length; i++){
            for(int k = i; k < num.length; k++){
                if(num[i] > num[k]){
                    int temp = num[i];
                    num[i] = num[k];
                    num[k] = temp;
                }
            }
        }

        return num;
    }

}
