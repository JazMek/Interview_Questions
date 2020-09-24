package strings_Questions;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Check_If_Two_Given_Strings_Are_Anagram {
    /*
    Java program to check if two given strings are anagram.
    Write a method to check if two given strings are anagram.
    For example: "Angel" and "Angle" are anagrams.
    Note: it is not a case sensitive(doesn't mater if it's Uppercase or Lowercase).
    Note: do not use the in-built methods.
    Note: use the in-built methods.
    Note: it is not a case sensitive.
    Input :"Angel","Angle"
    Expected Result : true
    Input :  "Army","Mary"
    Expected Result : true
    Input :   "","Mary"
    Expected Result : false
    Input :"M","Mary"
    Expected Result : false
    Input :"Angele","Angle"
    Expected Result : false
    Input : "",""
    Expected Result : false
    */


    public static void main(String[] args) {
        System.out.println(isAnagram("Hemou","Mouhe" ));
        System.out.println(isanagram("marya","Amyra" ));
        System.out.println(isAnagramCounting("marya","Amyra" ));
        System.out.println(is_Anagram_Counting("Amyra","marya" ));
    }

    public static boolean isAnagram(String string1, String string2){
        String []string1array=string1.toLowerCase().split("");
        String []string2array=string2.toLowerCase().split("");
        sort(string1array);
        sort(string2array);
        return Arrays.equals(string1array, string2array);
    }
    public static boolean isanagram(String string1, String string2){
        String []string1array=string1.split("");
        String []string2array=string2.split("");
        sort(string1array);
        sort(string2array);
        String str1="";
        String str2="";
        for(int i=0;i<string1.length();i++){
        str1=str1+string1array[i];
        str2=str2+string2array[i];
        }
        return str1.equalsIgnoreCase(str2);
    }
    //  First method without Sorting method
    private static int CHARACTER_RANGE= 256;

    public static boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) { // +1 a b
            count[string1.toLowerCase().charAt(i)]++; // "a r b y " count[a]={1,1,1,1} {0,1,2,3.........65.75....256}
            count[string2.toLowerCase().charAt(i)]--; // "m a r y" count[a]={-1,-1,-1,-1} {0,1,2,3......65...65}
        } // -1 count[i]={-1,0,1,0} {0,0,0,0.........65}
        for (int i = 0; i < CHARACTER_RANGE; i++) { // {4,2,6,}
            if (count[i] != 0) { // count={2,2,2,2}
                return false;
            }
        }
        return true;
    }

    //  Second method without Sorting method
       public static boolean is_Anagram_Counting(String string1, String string2) {
        if(string1.length()!=string2.length()){return false;}
        int length=string1.length();
            char []string1Char=string1.toLowerCase().toCharArray();
            char []string2Char=string2.toLowerCase().toCharArray();
            int [] count =new int [CHARACTER_RANGE];
            int i;
            for(i=0;i<length;i++) {
                count[string1Char[i]]++;
                count[string2Char[i]]--;
            }
            for(i=0;i<CHARACTER_RANGE;i++){
                if(count[i]!=0) return false;
            }
           return true;
      }
}