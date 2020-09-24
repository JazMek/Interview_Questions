package arrays_Questions;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Number {
                    /*
                    Java program to find a duplicate number in a given range of numbers:
                    You have got a range of numbers between 1 to N, where one of the number is repeated.
                    Write a method to find the duplicate number.
                    Note:
                    Input : arr[] = { 1, 3, 2,4, 5, 6,4}
                    Expected Result : 4
                    Input : arr[] = { 1, 3, 2, 13,5, 6,4,7,8,10,11,12,15,16,13,9,14}
                    Expected Result : 13
                    Input : arr[] = {2}
                    Expected Result : 0
                    Input : arr[] = [Empty]
                    Expected Result : 0
                    Input : arr[] = {}
                    Expected Result : 0
                    Input : arr[] = { 1, 3, 2, 5, 6,4}
                    Expected Result : 0
                    Input : arr[] = { 1, 2, 2}
                    Expected Result : 2
                    Input : arr[] = { 1,2}
                    Expected Result : 0

                  */

               public static void main(String[] args) {
                  int []num ={1,2,3,2};
                  System.out.println(duplicate_Number_In_Array(num));
                   System.out.println(duplicate_Number_in_Array(num));
                  System.out.println(duplicate_Number_In_Array_Using_HashSet(num));
          }


         //     Method N:01

         public static int duplicate_Number_in_Array(int [] num){
               if(num==null ){ return 0;}
               int dupnumb=0;
               int i ,j;
            for(i=0;i<num.length;i++){
               for(j=0;j<i;j++){ if(num[j]==num[i]){dupnumb=num[i];break;}
               }
            }
        return dupnumb;
        }

        //     Method N:02
        public static int duplicate_Number_In_Array(int [] num){
                  if(num==null ){ return 0;}
                  int sumNum=num.length;
                  int sumNumdup=0;
                  int i;
                  for(i=0;i<num.length;i++){
                     sumNumdup = sumNumdup + num[i];
                     sumNum = sumNum +i;
                  }
                  int dupnumb=  sumNumdup-sumNum ;
                  if(dupnumb<0){return num.length+dupnumb;}
                  else return dupnumb;
          }

        //     Method N:03 Using HashSet
        public static int duplicate_Number_In_Array_Using_HashSet(int [] num){
                  if(num==null ){ return 0;}
                  Set<Integer> numHash =new HashSet<>();
                  int sum=0;
                  int sumHash=0;
                  for(int numb : num){
                     sum=sum+numb;
                     numHash.add(numb);
                  }
                  for( int numhash :numHash){
                     sumHash=sumHash+numhash;
                  }
                  int Result =sum - sumHash ;
                  return Result;
        }


   }
