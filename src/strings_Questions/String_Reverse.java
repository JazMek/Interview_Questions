package strings_Questions;

public class String_Reverse {


    /*
    Java program to reverse String in Java.
    Write a method that takes in a String and returns the reversed version of the String.
    Notes:
    Use API functions ?
    without using API functions ?
    Examples:
    Input : "abcde"
    Expected Result : "edcba"
    Input : "1"
    Expected Result : "1"
    Input : ""
    Expected Result : ""
    Input : "madam"
    Expected Result : "madam"
    Input : null
    Expected Result : null
 */
    public static void main(String[] args) {
        String blogName = "Karim";
        String str = "miharbI a nakaha";
        String blogName1 = "java2blogibrahim";
//        stringReverse(blogName);
//        stringBufferReverse(blogName1);
//        System.out.println(stringReversekarim(blogName1));
//        System.out.println(stringBuldeurReverse(blogName1));
//        System.out.println(reverse_String(str));
        System.out.println(Reverse_String(str,""));
    }
    //karim method to reverse the giver String
    public static String stringReversekarim(String string){
        StringBuffer sb=new StringBuffer(string);
        return sb.reverse().toString();
    }
   // Using for loop
    public static void stringReverse(String str){
        String reversString="";
        for (int i=str.length()-1;i>=0;i--){
            reversString=reversString+str.charAt(i);
        }
        System.out.println(reversString);

    }
    //    using StringBuffer
    public static void stringBufferReverse(String str1) {
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("Reverse of java2blog is:" + sb.reverse());
    }
    //    using StringBuilder
    public static String  stringBuldeurReverse(String str){
        StringBuilder strB=new StringBuilder(str);
        return strB.reverse().toString();
    }

    public static String reverseString(String str){
        String inputString = str;
        String outputString = null;
        if(inputString!=null){
            StringBuffer sb= new StringBuffer(inputString);
            outputString= sb.reverse().toString();
        }
        return outputString;
    }
    // Using Recursion:
    public static String reverse_String(String str){
        if(str==null){ return null;}
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        return reversed;
    }
    // Using Recursion:
//    Am
    public static String Reverse_String(String str,String reversed){
        int i=str.length()-1-reversed.length();
        if(i!=-1)
            reversed= Reverse_String(str.substring(1),reversed)+str.charAt(0);
        i--;
        return reversed;
    }
}
