package solution;

//Reverse a String
//File: ReverseString.java
//Input: "hello"
//Output: "olleh"

public class ReverseString {

    public static String reverseString(String str){
        String reverseStr = "";
        for(int i = str.length() - 1; i > 0; i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static String reverseByStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
