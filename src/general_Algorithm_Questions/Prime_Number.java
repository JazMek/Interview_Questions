package general_Algorithm_Questions;

public class Prime_Number {
                    /*
               Java program to find if a given number is a Prime number or not:
               Write a java program to find if a given number is a Prime number or not using Recursion as well as Iteration.
               Note: Use Recursion method as well as Iteration if it's possible.
               Input : 0
               Expected Result : true
               Input : 1
               Expected Result : false
               Input : 2
               Expected Result : true
               Input : 5
               Expected Result : false
               Input :44
               Expected Result :true
               */

               public static void main(String[] args) {
                   int num=4;
                   System.out.println(is_Prime_Number( num));
          }
          public static boolean is_Prime_Number(int num){
                   boolean flag=true;
                   for(int i=2;i<num/2;i++){
                       if(num%i==0){flag= false;}
                       else flag= true; }
                   return flag;
          }
}
