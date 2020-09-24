package strings_Questions;

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
            System.out.println(maximum_occurring_character(str));
       }
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

   }
