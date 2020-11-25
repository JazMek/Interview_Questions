package homeWorkEsay;

public class HommeWork2 {
    public static void main(String[] args) {
        String str1="madam" ;
        System.out.println(str1 +" is a Palindrome : "+tow_String_Are_Palindrome(str1));

    }
    public static boolean tow_String_Are_Palindrome(String str1){
        boolean flag=true;
        for (int i=0,j=str1.length()-1;i<=str1.length()/2;i++,j--){
            if(str1.toLowerCase().charAt(i)!=str1.toLowerCase().charAt(j)) flag=false;
        }
        return flag;
    }
}
