package strings_Questions;

import java.util.HashMap;
import java.util.Map;

public class Find_the_maximum_occurring_character_in_a_given_string {
        /*
        Find the maximum occurring character in a given string .
        Return null if no unique maximum character is found.
        Input : abcdcd
        Expected Result : c
        Input : abcdeg
        Expected Result : null
        Input : ""
        Expected Result : null
        Input : aabcdc
        Expected Result : a
        Input : aaaa
        Expected Result : a
        Input : b
        Expected Result : b
        Input : bbaacdd  ===> I have to work on it !!!!!!
        Expected Result : b
         */

        public static void main(String[] args) {
            String str="abcabac";
            System.out.println("Method N:01 ==> maximum occurring character is: "+maximum_occurring_character(str));
            System.out.println("Method N:02 ==> maximum occurring character is: "+maximum_Occurring_Character(str));
            System.out.println("Method N:03 ==> maximum occurring character is: "+maximum_Occurring_character(str));
            System.out.println("Method N:04 ==> maximum occurring character is: "+Maximum_Occurring_Character(str));

       }
//       Method N:01
       public static Character maximum_occurring_character(String str){
           if(str==null ||str.length()==0){ return null;}
               int maxchar=0;
               char charmax=' ';
               char [] strchar=str.toCharArray();
               int [] charcount = new int [str.length()];
               for(int i=0;i<strchar.length;i++){
                   for(int j=0;j<strchar.length ;j++){
                       if(strchar[j]==strchar[i]){
                           charcount[i]++;
                       }
                   }
                   if(charcount[i]>maxchar ||strchar.length==1 ){maxchar =charcount[i];  charmax=strchar[i];}
               }
               if ((maxchar==1 && str.length()!=1)){ return null;}
               else return charmax;
           }
//       Method N:02
    public static Character maximum_Occurring_character(String str){
        if(str==null ||str.length()==0){ return null;}
        char[] stChar = str.toCharArray();
        Map<Character, Integer> karim = new HashMap<>();
        int max=0;
        char charMax=' ';
        int[] count = new int[stChar.length];
        for (int i = 0; i < stChar.length; i++) {
            for (int j = 0; j < stChar.length; j++) {
                if (stChar[i] == stChar[j])
                    count[i]++;
            }
            karim.put(stChar[i], count[i]);
        }
        for (int value:karim.values()) {
            if(value> max)
                max=value;
        }
        for (Character key:karim.keySet()) {
            if(karim.get(key)==max){
                charMax=key;}
        }
        return charMax;
    }
//       Method N:03
    public static Character maximum_Occurring_Character(String str){
        if(str==null ||str.length()==0){ return null;}
        char[] stChar = str.toCharArray();
        Map<Character, Integer> karim = new HashMap<>();
        int max=0;
        char charMax=' ';
        int[] count = new int[stChar.length];
        for (int i = 0; i < stChar.length; i++) {
            for (int j = 0; j < stChar.length; j++) {
                if (stChar[i] == stChar[j])
                    count[i]++;
            }
            karim.put(stChar[i], count[i]);
        }
        for(HashMap.Entry<Character, Integer> amar: karim.entrySet()){
            if(amar.getValue()> max)
                max=amar.getValue();
            if (amar.getValue()==max){
                charMax=amar.getKey();
            }
        }
        return charMax;
    }
//       Method N:04
    public static Character Maximum_Occurring_Character(String str){
        if(str==null ||str.length()==0){ return null;}
        char[] stChar = str.toCharArray();
        Map<Character, Integer> Ibrahim = new HashMap<>();
        int max=0;
        char charMax=' ';
        int i ,j;
        for (i = 0; i < stChar.length; i++) {
            int count=0;
            for(j=0;j<stChar.length; j++){
                if(stChar[i]==stChar[j])count++;
            }
            Ibrahim.put(stChar[i], count);
        }
        for(HashMap.Entry<Character, Integer> amar1: Ibrahim.entrySet()){
            if(amar1.getValue()> max)
                max=amar1.getValue();
            if (amar1.getValue()==max){
                charMax=amar1.getKey();
            }
        }
        return charMax;
    }

   }
