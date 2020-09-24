package strings_Questions;

import java.util.Scanner;

public class Replace_all_Characters {
         /*
       Write a method to replace all Characters in a string with a given replacement string.
       replace("This is a test","/") --> "This/is/a/test"
       Note: Avoid using the in-built String.replaceAll() method.
       Input : "This is a test"," ","/"
       Expected Result : This/is/a/test
       Input : "This is a test"," ",""
       Expected Result : ThisABCisABCaABCtest
       Input : "Replace all spaces"," ","*"
       Expected Result : Replace*all*spaces
       Input : "This"," "," "
       Expected Result : This
       Input : "This/is/a/test/for/Ibrahim","/"," * "
       Expected Result : This
       Input : [Empty]
       Expected Result : [Empty]
      */

    public static void main(String[] args) {

        System.out.println("Enter the string : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Enter the character  you want to replace : ");
        String toRep = scan.nextLine();
        System.out.println("Enter the character to replace with : ");
        String Repl = scan.nextLine();
        System.out.println(replace_All_Characters(str, toRep, Repl));
        System.out.println(replace_all_Characters(str, toRep , Repl));
        System.out.println(replace_string_Characters(str, toRep, Repl));
        System.out.println(replace_String(str, toRep, Repl));
    }
    // method using in built methods
    public static String replace_All_Characters(String string, String ToReplace, String Replacement) {
        return string.replaceAll(ToReplace, Replacement);
    }

    // method without using in built methods
    public static String replace_all_Characters(String str, String ToReplace, String Replacement) {
        String replacedStr = "";
        String[] strArray = str.split(ToReplace);
        int i;
        for (i = 0; i < strArray.length - 1; i++) {
            replacedStr = replacedStr + strArray[i] + Replacement;
        }
        replacedStr = replacedStr + strArray[strArray.length - 1];
        return replacedStr;
    }

    // method without using in built methods ( substring method)
    public static String replace_string_Characters(String string, String ToReplace, String Replacement) {
        String[] strArray = string.split(ToReplace);
        String str = "";
        for (int i = 0; i < strArray.length; i++) {
            str = str + strArray[i] + Replacement;
        }
        return str.substring(0, str.length() - Replacement.length());
    }
    // method without using in built methods ( Using StringBuilder)
    public static String replace_String(String str, String ToReplace, String Replacement) {
        StringBuilder builder = new StringBuilder();
        char []strchar=ToReplace.toCharArray();
        char c=strchar[0];
        int i;
        for (i = 0; i < str.length(); i++) {
           if (str.charAt(i) == c ){builder.append(Replacement);}
            else
                builder.append(str.charAt(i));
        }
        return builder.toString();
    }


  }