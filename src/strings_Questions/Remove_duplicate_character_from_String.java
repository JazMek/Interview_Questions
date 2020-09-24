package strings_Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_character_from_String {
        /*
       Java program to remove duplicates characters :
       Write a method to remove all duplicates characters in a given string.
       Note: Avoid using the in-built method.
       Note: using the in-built method.
       Input : This is a test
       Expected Result : this ae
       Input : Replace all spaces
       Expected Result : replac s
       Input : This
       Expected Result : This
       Input : [Empty]
       Expected Result : null
       Input : null
       Expected Result : null
     */
        public static void main(String[] args) {
            String str="";
            System.out.println(remove_Duplicates_Character(str));
            System.out.println(remove_Duplicates_Character_from_String(str));
            System.out.println(remove_Duplicates_Character_Using_LinkedHashSet(str));

        }
    //     Method N:01
    public static String remove_Duplicates_Character_from_String(String str){
        if(str==null ||str.length()==0){ return null;}
        String nonDuplicStr ="";
        int i,j;
        for(i=0;i<str.length();i++){
            for(j=0;j<i;j++){
                if(str.charAt(j)==str.charAt(i)){
                    break;
                }
            }
            if(i==j){ nonDuplicStr=nonDuplicStr+ str.charAt(i);}
        }
        return nonDuplicStr;
      }

      //     Method N:02
      public static String remove_Duplicates_Character(String str){
            if(str==null ||str.length()==0){ return null;}
            char [] strChar= str.toCharArray();
            String nonDuplicStr ="";
            int index=0;
            int i,j;
            for(i=0;i<strChar.length;i++){
                for(j=0;j<i;j++){
                    if(strChar[j]==strChar[i]){
                        break;
                    }
                }
                if(i==j){ strChar[index++]=strChar[i];}
            }
          for(i=0;i<index;i++){
              nonDuplicStr=nonDuplicStr+ strChar[i];
          }
          return nonDuplicStr;
        }
    //     Method N:03 Using LinkedHashSet

    public static String remove_Duplicates_Character_Using_LinkedHashSet(String str){
        if(str==null ||str.length()==0){ return null;}
        char [] strChar= str.toCharArray();
        String nonDuplicStr ="";
        Set<Character> strSet = new LinkedHashSet<>();
        for(int i=0;i< strChar.length;i++){
            strSet.add(strChar[i]);
        }
        for(char strSetChar:strSet) {
            nonDuplicStr=nonDuplicStr+strSetChar;
        }
        return nonDuplicStr;
    }
}
