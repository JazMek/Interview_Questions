package strings_Questions;

import java.util.*;

public class Return_Duplicates_From_String {
    /*
       Java program to return the  duplicates characters from a given string:
       Write a method to return all duplicates characters in a given string.
       Note: Avoid using the in-built method.
       Note: using the in-built method.
       Input : "abcdac1561h5h0n0n"
       Expected Result : [a, c, 1, 5, h, 0, n]
       Input : "Replace all spaces"
       Expected Result : [e, a, l,  , p, c, s]
       Input : "This"
       Expected Result : []
       Input : "a"
       Expected Result : []
       Input : [Empty]
       Expected Result : []
       Input : null
       Expected Result : null
     */


    public static void main (String [] args){

        String str="Repelacee dreeedfff vfre";
        System.out.println(print_duplicates(str));
        System.out.println(Print_Duplicates(str));
        System.out.println("***********************");
        System.out.println(Arrays.toString(print_Duplicates(str)));
    }
//    Method N01 :
public static Set<Character> print_duplicates(String Instring){
        if (Instring == null){ return null ;}
        char [] InstringChar =Instring.toCharArray();
        Set<Character> InstringList = new LinkedHashSet<>();
        int i,j;
        for(i=0;i<InstringChar.length ;i++){
            for(j=0;j<i;j++){
                if(InstringChar[j]==InstringChar[i]){ break;}
            }
            if(j!=i){ while (! InstringList.contains(InstringChar[j])){InstringList.add(InstringChar[j]);}
            }
        }
        return InstringList;
    }
//    Method N02 :
public static Set<Character> Print_Duplicates(String Instring){
    if (Instring == null){ return null ;}
    char [] InstringChar =Instring.toCharArray();
    Set<Character> InstringSet = new HashSet<>();
    Set<Character>InstringSet2 = new HashSet<>();
    for(Character charStr : InstringChar){
        if(!InstringSet.add(charStr)){
            InstringSet2.add(charStr);}
    }
    return InstringSet2;
}
    public static char[] print_Duplicates(String Instring){
        if (Instring == null){ return null ;}
        char [] InstringChar =Instring.toCharArray();
        int i,j;
        int index=0;
        int index1=0;
        int index2=0;
        for(i=0;i<InstringChar.length ;i++){
            for(j=0;j<i;j++){
                if(InstringChar[j]==InstringChar[i]){ break;}
            }
            if(j!=i){InstringChar[index++]=InstringChar[j];}
        }
        char [] firstArry= new char[index];
        for (i=0;i<index;i++){
            firstArry[i]=InstringChar[i];
        }
        for(i=0;i<index ;i++){
            for(j=0;j<i;j++){
                if(firstArry[j]==firstArry[i]){ break;}
            }
            if(j==i){firstArry[index1++]=firstArry[i];}
        }
        char [] secondArry = new char[index1];
        for (i=0;i<index1;i++){
            secondArry[i]=firstArry[i];
        }
        return secondArry;
    }
//    Method N3
public static Set<Character> duplicateChar(String str) {
    if (str == null) return null;
    char[] strChar = str.toLowerCase().toCharArray();
    int i;
    Set<Character> dupstr1Char = new LinkedHashSet<>();
    Set<Character> dupstr2Char = new LinkedHashSet<>();
    for (i = 0; i < strChar.length; i++) {
        if (!dupstr1Char.add(strChar[i])) {
            dupstr2Char.add(strChar[i]);
        }
    }
    return dupstr2Char;
}
}
