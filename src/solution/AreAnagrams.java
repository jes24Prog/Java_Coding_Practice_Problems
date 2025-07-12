package solution;

import java.util.Arrays;
import java.util.stream.Collectors;

//Check Anagram Strings
//File: AreAnagrams.java
//Input: "listen", "silent"
//Output: true


public class AreAnagrams {

    public static String stringSort(String str){
        return Arrays.stream(str.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }

    public static char[] stringToArray(String str){
        return stringSort(str).toCharArray();
    }


    public static Boolean areAnagrams(String str1, String str2){
        if(str1.length() == str2.length()){
            return Arrays.equals(stringToArray(str1), stringToArray(str2));
        }
        return false;
    }

}
