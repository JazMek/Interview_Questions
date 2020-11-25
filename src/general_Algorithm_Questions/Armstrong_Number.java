package general_Algorithm_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong_Number {
    /*
    Java program to check if a number is Armstrong or not
    Write a Java program to check if a number is Armstrong or not ?
    Armstrong Number in Java: A positive number is called armstrong number
     if it is equal to the sum of cubes of its digits
     for example 0, 1, 153, 370, 371, 407 etc.
     Let's try to understand why 153 is an Armstrong number.
      1 5 3        1exp3   5exp3    3exp3
       153     = (1*1*1)+ (5*5*5)+ (3*3*3)
       1 5        1exp2   5exp2
       15     =  (1*1) + (5*5)
      1 6 3 4        1exp4       6exp4      3exp4     4exp4
       1634   =     (1*1*1*1)+ (6*6*6*6)+ (3*3*3*3)+ (4*4*4*4)
     */

    public static void main(String[] args) {
        int num=10;
//        System.out.println(is_Armstrong_Number(num));
        Is_Armstrong_Number( num);
    }

     public static boolean is_Armstrong_Number(int num){
        if(num==0){return false;}
        int sum=0;
        String strnum= String.valueOf(num);
        char []numChar= strnum.toCharArray();
        List<Integer> numList= new ArrayList<>();
         for (char charNum:numChar) {
             numList.add(Character.getNumericValue(charNum));
         }
         int multpSum=1;
         for(int x: numList){
             int i=numList.size();
             while (i>0){
                 multpSum=multpSum * x;
                 i --;
             }
             sum=sum+multpSum;
             multpSum=1;
         }
         if(sum==num)return true;
         else return false;
     }
    public static void Is_Armstrong_Number(int num){
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter your number ");
        int number=scn.nextInt();
        int number1,restOfDevision= 0;
        number1 = number;
        List<Integer>NumberList= new ArrayList<>();
        while(number1 > 0) {
            restOfDevision= number1 % 10;
            number1 =number1/ 10;
            NumberList.add(restOfDevision);
        }
        System.out.println(NumberList);
        int totalNumb =0;
        int total=1;
        for (Integer num1:NumberList ) {
            int leng=NumberList.size();
            while(leng>0){
                total= total * num1;
                leng--;
            }
            totalNumb = totalNumb + total; //1
            total=1;
        }
        if (totalNumb==number){
            System.out.println("the number is amstrong ");
        }else {
            System.out.println("the number is not amstrong ");
        }
    }
    public static void Is_Armstrong_Number01(int num){
        int nun1 = num;
        int result=0;
        int rest;
        int amstrnum;
        amstrnum=num;
        int counter =0;
        while (nun1 >0) {
            nun1 = nun1 / 10;
            counter++;
        }
        while (amstrnum !=0){
            rest = amstrnum % 10;
            result += Math.pow(rest,counter);
            amstrnum /=10;
        }
        if (result == num){
            System.out.println(num+" is an amstrong number");
        }
        else {
            System.out.println(num+" is not an amstrong number");
        }
    }
}
