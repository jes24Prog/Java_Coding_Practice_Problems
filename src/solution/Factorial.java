package solution;

//Factorial of a Number
//File: Factorial.java
//Input: 5
//Output: 120

public class Factorial {

    public static int factorial(int num){
        if(num > 0){
            return num * factorial(num - 1);
        }else{
            return 1;
        }
    }
}
