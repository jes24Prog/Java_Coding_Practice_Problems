package solution;

//Check if a String is Palindrome
//File: IsPalindrome.java
//Input: "racecar"
//Output: true


public class IsPalindrome {

    public static String reverseByStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static Boolean isPalindrome(String str){
        return reverseByStringBuilder(str).equals(str);
    }

}
