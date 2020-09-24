package general_Algorithm_Questions;

public class Multiplication_Without_Using_Operator {
            /*
       Java program for Multiplication without using a multiplication operator (*) :
       Write a method to multiply two given numbers : " X " ," Y " without using a multiplication operator (*).
       Note: Avoid using the in-built method.
       Note: Use recursion method.
       Input : " X = 6 " ," Y = 5 "
       Expected Result : 30
       Input :  " X = - 6 " ," Y = - 5 "
       Expected Result : 30
       Input : " X = - 6 " ," Y = 5 "
       Expected Result : - 30
       Input : " X = 0 " ," Y = 5 "
       Expected Result : 0
       Input :  " X = 0 " ," Y = 0 "
       Expected Result : 0
           */

    public static void main(String[] args) {
       int x= 0;
       int y= 0;
        System.out.println(multiplicationUsingAddition(x,y));
        System.out.println(multiplicationUsingRecursion(x,y));

    }

    public static int multiplicationUsingAddition(int x, int y){
        int Result=0;
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;
        while(y>0){
            Result=Result +(x);
          y--;}
        }
        else if((y>0 && x<0 )||(y>0 && x>0)){
        while(y>0){
        Result=Result +(x);
        y--;}
        }
        return Result;
    }
    public static int multiplicationUsingRecursion(int x, int y){
        int Result=0;
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;
            if(y>0){
       Result= x+multiplicationUsingRecursion(x,y-1);}
        }
        else if((y>0 && x<0 )||(y>0 && x>0)){
            if(y>0){
                Result= x+multiplicationUsingRecursion(x,y-1);}
        }
        return Result;
      }

   }
