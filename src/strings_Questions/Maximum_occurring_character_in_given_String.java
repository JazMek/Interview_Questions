package strings_Questions;

import java.util.HashMap;
import java.util.Map;

public class Maximum_occurring_character_in_given_String {
    public static void main(String[] args) {
        String str="abbcccd";
//                  12233322
//                  a ==>1 b ==>2 c==>3 d==>2
        System.out.println(maximum_Occurring_Character(str));
        System.out.println(maximum_Occurring_character(str));
        System.out.println(Maximum_Occurring_Character(str));
        System.out.println(maximum_occurring_character(str));
    }
         public static char maximum_occurring_character(String str){
         char[] strChar= str.toCharArray();
         char maxChar=' ';
         int max=0;
         int []charcount = new int[strChar.length];
         for(int i=0;i<charcount.length;i++){
             for (int j=0;j<charcount.length;j++){
                 if(strChar[j]==strChar[i]){
                     charcount[i]++;
                 }
             }
             if(charcount[i]>max){
                 max=charcount[i];
                 maxChar=strChar[i];
             }
         }
         return maxChar;
         }
    public static char maximum_Occurring_character(String st){
    char[] stChar = st.toCharArray();
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
    public static char maximum_Occurring_Character(String st){
        char[] stChar = st.toCharArray();
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
    public static char Maximum_Occurring_Character(String st){
        char[] stChar = st.toCharArray();
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
