package strings_Questions;

import java.util.Scanner;

public class Remove_Character_From_A_Given_String {

    /*
    Java program to remove given characters from a given String
    Write a method to remove given characters from the String .
    replace("This is a test",' ') --> "Thisisatest"
    Note: use the in-built String.replaceAll() method and iteration.
    Input :"This is a test",' '
    Expected Result : Thisisatest
    Input :  "b",'a'
    Expected Result : null
    Input : "1ba1r1b1a1r1a1",'1'
    Expected Result : barbara
    Input : "barbara",'b'
    Expected Result : arara
    Input : "barbara",'a'
    Expected Result : brbr
    Input : [Empty]
    Expected Result : null
    */


    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Enter The character you want to remove : ");
        String xString = scan.nextLine();
        char x= xString.charAt(0);
//        String str="barbara";
//        char x='b';
        System.out.println(Remove_Character_From_String (str ,x));
        System.out.println(Remove_Character_From_Given_String (str ,x));
        System.out.println(Remove_Char_From_String(str,x));

    }
    //    Method n:1
    public static String Remove_Character_From_String (String str ,char x){
        if(str==null || str.length()==0||str.length()==1){ return null;}
        char [] strChar= str.toCharArray();
        String strNoChar="";
        int i;
        for(i=0;i<str.length();i++){
           if(strChar[i]!=x){ strNoChar=strNoChar+strChar[i];}
            }
        return strNoChar;
        }
    //    Method n:2
    public static String Remove_Character_From_Given_String (String str ,char x){
        if(str==null || str.length()==0||str.length()==1){ return null;}
        String str1="";
        str1=str1+x;
//        Using Rachid Method
        String str2= String.valueOf(x);
        String strNoChar=str.replaceAll(str2,"");
        return strNoChar;
    }
    //    Method n:3
        public static String Remove_Char_From_String(String str,char x){
            StringBuilder strBuild = new StringBuilder();
            for (int i = 0; i< str.length(); i++){
                if( str.charAt(i)==0 || str==null )return null;
                if (str.toLowerCase().charAt(i) !=x)
                    strBuild.append(str.charAt(i));
            } return String.valueOf(strBuild);
        }

    }



