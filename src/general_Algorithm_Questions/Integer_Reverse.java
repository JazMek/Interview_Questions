package general_Algorithm_Questions;

public class Integer_Reverse {
                /*
               Java program to reverse a given Integer number:
               Write a method to reverse a given Integer number.
               Note: Avoid using the in-built method.
               Note: Use in-built method.
               Input : 3
               Expected Result : 3
               Input :  18
               Expected Result : 81
               Input : 230
               Expected Result : 23
               Input : 1987
               Expected Result : 7891
               Input : 0
               Expected Result : 0
               Input :123456986 ===> max characters accepted du to the integer size limit.
               Expected Result :689654321
                */

    public static void main(String[] args) {
        int num= 123456986;
//        System.out.println(reverse_Integer_Using_In_Built_Method(num));
        System.out.println(reverse_Integer_Avoid_Using_In_Built_Method(num));
    }
    //    Reverse integer using in built method (using the string class characteristics)

    public static long reverse_Integer_Using_In_Built_Method(int num){
        String Xstring =Integer.toString(num);
        StringBuffer sb= new StringBuffer (Xstring);
        String reversedXstring=sb.reverse().toString();
        int reversedNumber =Integer.parseInt(reversedXstring);
        return reversedNumber;
    }
     //    Reverse integer using in built method

     public  static int reverse_Integer_Using_In_Built_Method1(int num){
         Integer x=Integer.valueOf(num);
         String xstr=x.toString();
         StringBuilder sb =new StringBuilder(xstr);
         String xsb=sb.reverse().toString();
         Integer Inxstr=Integer.parseInt(xsb);
         int reversx=Inxstr.intValue();
        return reversx;

     }
    //    Reverse integer avoid using in built method

    public  static int reverse_Integer_Avoid_Using_In_Built_Method(int num){
        int revnum=0;
        while(num!=0){
            revnum=(revnum*10)+num%10;
            num=num/10;
        }
      return revnum;
    }
}
