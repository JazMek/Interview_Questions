package strings_Questions;

import java.util.Scanner;

public class Remove_junk_expressions_from_string {
       /*
       Java program to remove junk expressions from a given string:
       Write a method to remove  junk expressions from a given string.
       Note: us this expression  "[^a-zA-Z0-9]".
       Input String : @@**##karim&&_**__!!Ibrahim@#**+++++)Hakim(*#&$^%@!!**Mahmoudoul**!><<??++???
       Input Regular expression : [^a-zA-Z0-9*]
       Input Replacement : " "
       Expected Result :
       Input : @@**##karim&&_*and*__!!Ibrahim@#**+and)Hakim(*#&$^%@!!****!><<??++???
       Input Regular expression : "[^a-zA-Z0-9]"
       Input Replacement : *
       Expected Result :******karim*********Ibrahim**********Hakim************Mahmoudoul*************
     */

       public static void main(String[] args) {
           System.out.println("Enter the string : ");
           Scanner scan = new Scanner(System.in);
           String str = scan.nextLine();
           System.out.println("Enter the list of characters  you want to replace : ");
           String Regex = scan.nextLine();
           System.out.println("Enter The character you want to replace with : ");
           String Replacement = scan.nextLine();
           System.out.println(remove_junk_expressions(str,Regex,Replacement));
      }


      public static String remove_junk_expressions(String str,String Regex ,String Replacement ){
          return str.replaceAll( Regex,Replacement);
      }
 }
