package general_Algorithm_Questions;

import java.util.Scanner;

public class Factorial_Number {
                /*
               Java program to find Factorial of a given number :
               Write a java program to find Factorial of a given number using Recursion as well as Iteration.
               Example : Factorial of 5! = 5 x 4  X 3   X 2   X 1 = 120.
                                      n! = n*(n-1)*(n-2)*(n-3)*(n-4)
               Note: Avoid using the in-built method.
               Note: Use Recursion method as well as Iteration.
                     n=3   3!= n*!(n-1)
               Input : 0!
               Expected Result : 0
               Input : 1!
               Expected Result : 1
               Input : 2!
               Expected Result : 2
               Input : 5!
               Expected Result : 120
               Input :4!
               Expected Result :24
               */

              public static void main(String[] args) {
                  System.out.println("Enter The Number : ");
                  Scanner scan =new Scanner(System.in);
                  int x= scan.nextInt();
                  System.out.println("The Factorial of "+ x+" is : ");
                  System.out.println(factorial_Using_Iteration(x));
                  System.out.println(factorial_Using_Recursion(x));
    }
           // Using Iteration.
             public static int factorial_Using_Iteration(int x){
                  int factor=1;
                  if(x==0){ return 1;}
                  for(int i=1;i<=x;i++){
                      factor=factor*i ;
                  }
                 return factor;
             }
           // Using Recursion.
             public static int factorial_Using_Recursion(int x){
                   if(x==0){ return 1;}
                   int factor=1;
                   if(x>0){
                          factor=x*factorial_Using_Recursion(x-1);
                   }
                 return factor;
             }

     }
