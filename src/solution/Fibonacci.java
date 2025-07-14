package solution;

//Fibonacci Series
//File: Fibonacci.java
//Input: 6
//Output: 0 1 1 2 3 5

public class Fibonacci {

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void display(int size){
        for(int i = 0; i < size; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
