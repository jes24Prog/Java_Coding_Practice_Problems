package solution;

//Count Vowels and Consonants
//File: CountVowelsConsonants.java
//Input: "Hello World"
//Output: Vowels: 3, Consonants: 7

public class CountVowelsConsonant {
    public static char[] stringToArray(String str){
        return str.toLowerCase().toCharArray();
    }

    public static void countVowelConsonant(String str){
        char[] strToCharArr = stringToArray(str);
        char[] vowels = {'a','e','i','o','u'};

        int vowelCounter = 0;
        int consonantCounter = 0;

        for(var ch : strToCharArr){
            boolean isVowel = false;
            if(ch >= 'a' && ch <= 'z'){
                for(var vowel : vowels){
                    if(vowel == ch){
                        vowelCounter++;
                        isVowel = true;
                        break;
                    }
                }
                if(!isVowel){
                    consonantCounter++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCounter + " Consonant: " + consonantCounter);
    }
}
