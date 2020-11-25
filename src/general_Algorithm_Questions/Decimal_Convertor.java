package general_Algorithm_Questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Decimal_Convertor {
    /*Java Program to convert Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal.
    Write a java program to convert a given decimal number to : binary, octal and hexadecimal.
    Notes: Use The console to get the Input
           Use a mechanism to Restart the program or to Exit the program.
     Examples:
     Input:         Decimal    :34
     Expected Result:
                    Binary     : 100010
                    Octal      : 42
                    HexaDecimal: 22

     Input:         Decimal    :8
     Expected Result:
                    Binary     : 1000
                    Octal      : 10
                    HexaDecimal: 8
     */

    public static void main(String[] args) {
        decimal_Multi_Convertor();
    }

    public  static void decimal_Multi_Convertor(){
        final String B ="Binary";
        final String H ="HexaDecimal";
        final String O ="Octal";
        final String D ="Decimal";
        final String YES= "Y";
        final String NO= "N";
        long DNumber =0;
        boolean ExceptionFlag=false;
        String BNumber="";
        String HNumber="";
        String ONumber="";
        String Pro_Res_Or_End ="";
   do{
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************----> DECIMAL CONVERTOR <----**************************");
        System.out.println("\nEntre the number below :\n");
        System.out.print("Number : ");
            try {
                DNumber = sc.nextLong();
            } catch (InputMismatchException inputMismatchException) {
                ExceptionFlag = true;
            }
            if (!ExceptionFlag) {
                BNumber = Long.toBinaryString(DNumber);
                System.out.println("\n The " + B + "value of " + D + " number " + DNumber + " is : " + BNumber);
                ONumber = Long.toOctalString(DNumber);
                System.out.println("\n The " + O + "value of " + D + " number " + DNumber + " is : " + ONumber);
                HNumber = Long.toHexString(DNumber);
                System.out.println("\n The " + H + "value of " + D + " number " + DNumber + " is : " + HNumber);
            } else {
                System.out.println("Error -->Input must be a Decimal number ,Please tray again");
            }
               System.out.println("\nDo you want to Restart the program ? if YES enter: Y ,if NO entre: N ");
                Pro_Res_Or_End = sc.next();
                while (!(Pro_Res_Or_End.equalsIgnoreCase(YES) || Pro_Res_Or_End.equalsIgnoreCase(NO))) {
                    System.out.println(" Error -->You Must chose Y or N \n tray again");
                    Pro_Res_Or_End = sc.next();
                }
        }while (Pro_Res_Or_End.equalsIgnoreCase(YES));


    }
}
