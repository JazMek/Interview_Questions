package general_Algorithm_Questions;

public class Swiping_Tow_Integers {

         /*
            Java program to swipe tow integers without using a volatile variables :
            Write a method to swipe tow given numbers : " X " ," Y " without using a volatile variables.
            Note: Use arithmetic operators.
            Note: Use logical operators.
            Input :   " X = 0 " ," Y = 0 "
            Expected Result :   " X = 0 " ," Y = 0 "
            Input :   " X = 5 " ," Y = 7 "
            Expected Result :   " X = 7 " ," Y = 5 "
            Input :   " X = -5 " ," Y = 7 "
            Expected Result :   " X = 7 " ," Y = -5 "
            Input :   " X = 5 " ," Y = -7 "
            Expected Result :   " X = -7 " ," Y = 5 "
            */

    public static void main(String[] args) {

        int x=5;
        int y=7;
        //         Before swiping
        System.out.println("Before swiping : "+"x= "+x+" , "+" y= "+y);
        //         Using multiplication and division
        swipe_Tow_Integers_Using_Multiplication_And_Division(x,y);
        //        Using addition and subtraction
        swipe_Tow_Integers_Using_Addition_And_Subtraction(x,y);
        //       Using logical operator
        swipe_Tow_Integers_Using_Logical_Operator_XOR(x,y);
    }



//Using arithmetic  operator

    //        Using multiplication and division

    public static void swipe_Tow_Integers_Using_Multiplication_And_Division(int x,int y){
//      x=5,y=7
        x=x*y;
//      x=5*7  ==>x=35
        y=x/y;
//      y=35/7  ==>y=5
        x=x/y;
//      x=35/5 ==>x=7
        System.out.println("Using multiplication and division : "+"x= "+x+" , "+" y= "+y);
    }
    //        Using addition and subtraction
    public static void swipe_Tow_Integers_Using_Addition_And_Subtraction(int x,int y){

        x=x+y;
//      x=5+7   ==>x=12
        y=x-y;
//      y=12-7  ==>y=5
        x=x-y;
//      x=12-5  ==>x=7
        System.out.println("Using addition and subtraction : "+"x= "+x+" , "+" y= "+y);
    }

    //       Using logical operator

            /* Using XOR operator : ^
                 x  | y     | XOR
             false  | false | false
               true | false | true
             false  | true  | true
              true  | true  | false
           */
    public static void swipe_Tow_Integers_Using_Logical_Operator_XOR(int x,int y){
//      x =5 = 0101 ,y = 7 = 0111
        x= x^y;
//         0101
//         0111
//  x=5^7= 0010
        y= x^y;
//        0010
//        0111
//  y=2^7=0101=5
        x= x^y;
//        0010
//        0101
//  x=2^5=0111=7
        System.out.println("Using logical operator XOR : "+"x= "+x+" , "+" y= "+y);
    }
}
