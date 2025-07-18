package solution;

//Rearrange Array Alternating Positive and Negative
//File: RearrangePositiveNegative.java
//Instructions: Rearrange the array so that positive and negative numbers alternate, preserving order.
//Input: [1, 2, 3, -4, -1, 4]
//Output: [-4, 1, -1, 2, 3, 4]

public class RearrangePositiveNegative {

    public static int[] rearrangePositiveNegative(int[] arr){

        //sort
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(arr[i] < arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        //alternate negative positive
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(arr[i] < 0 && k % 2 == 0){
                    if(arr[i] < arr[k]){
                        int temp = arr[i];
                        arr[i] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
