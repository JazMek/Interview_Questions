package general_Algorithm_Questions;

public class Fibonacci_Series {
                    /*
               Java program to find Fibonacci Series of a given number :
               Write a java program to find Fibonacci Series of a given number using Recursion as well as Iteration.
               The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number
               is found by adding up the two numbers before it.
               Write a recursive method that returns the nth Fibonacci number. n is 0 indexed,
               which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0
               and n == 3 should return 2. Assume n is less than 15.
               Even though this problem asks you to use recursion, more efficient ways to solve it
               include using an Array, or better still using 3 volatile variables to keep a track
               of all required values.
               Example : Fibonacci Series of(13)
                        Fib==>1 , 1 , 2 ,(1+2),(2+3),(3+5),(5+8),(8+13)
                        n ==> 1 , 2 , 3 ,  4  ,  5  ,  6  ,  7  ,  8
               Note: Avoid using the in-built method.
               Note: Use Recursion method as well as Iteration.
               Input : 0
               Expected Result : 0
               Input : 1
               Expected Result : 1
               Input : 2
               Expected Result : 1
               Input : 3
               Expected Result : 2
               Input : 5
               Expected Result : 5
               Input :6
               Expected Result : 8
               Input :7
               Expected Result :13
               */

               public static void main(String[] args) {
                   int n=6;
                   System.out.println(Fibonacci_Using_Iteration(n));
                   System.out.println(Fibonacci_Using_Recursion(n));

        }
              //    Fibonacci Series Using Iteration
              public static int Fibonacci_Using_Iteration(int n){
                   int Fib=0;
                   int a=1;
                   int b=0;
                   int i=0;
               while (i<n){
                   Fib=a+b;
                   a=b;
                   b=Fib;
                   i++;
               }
                  return Fib;
              }
              //    Fibonacci Series Using Recursion
             public static int Fibonacci_Using_Recursion(int n){
                 int Fib=1;
                 if(n==0){return 0;}
                 else{
                     int i=n;
                        while (i>1){
                             Fib= Fib + Fibonacci_Using_Recursion(n-i) ;
                          i--;
                         }
                     }
             return Fib;
          }




      }
