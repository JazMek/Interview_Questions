package strings_Questions;


public class String_count {
    /*
    Java program to count the number of strings in a given string.
    Write a method that count the number of strings in a given string.
    Notes:
    Use API functions ?
    without using API functions ?
    Examples:
    Input : "To day homework is to esy for Ibrahim"
    Expected Result : 8
    Input : "To day"
    Expected Result : 2
    Input : "To"
    Expected Result : 1
    Input : ""
    Expected Result : 0
 */
    public static void main (String [] args){

        String str="To day homework is to esy for Ibrahim";
        System.out.println(count_String_Number(str));
    }
    public static int count_String_Number(String str){
        String [] strArray = str.split(" ");
        return strArray.length ;
    }
}
