package strings_Questions;

public class Calculate_String_Length {
    /* Java program to count the length of a given string:
       Write a method to count the number of characters (Length) in a given string.
       Note: Avoid using the in-built method.
       Input : "This is a test"
       Expected Result :14
       Input : "Ibrahim"
       Expected Result : 7
       Input : "T"
       Expected Result : 1
       Input : ""
       Expected Result : 0
       Input : null
       Expected Result : null
    */
    public static void main (String []args){
        String str ="The String Length is: ";
        System.out.println("The String Length is: "+string_Lingth_calculator (str));

    }

    public static Integer string_Lingth_calculator (String str){
        int length=0;
        if (str==null) {return null;}
        else {
            int i=0;
            try{
                for(i=0; ;i++){
                    char x= str.charAt(i);
                }
            }catch(Exception e){
                length=i;
            }
        }
        return length ;
    }

}
