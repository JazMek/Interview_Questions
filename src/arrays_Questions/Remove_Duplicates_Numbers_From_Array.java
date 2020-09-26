package arrays_Questions;

import java.util.Arrays;

public class Remove_Duplicates_Numbers_From_Array {

                  /*
                    Java program to remove duplicates numbers from a given array of numbers:
                    Write a method to remove duplicates numbers from a given array of numbers
                    and return an array without duplicates.
                    Note:
                    Input : arr[] = {1,3,2,4,5,6,4}
                    Expected Result : {1,3,2,4,5,6}
                    Input : arr[] = {1, 3, 2, 13,5, 6,4,7,2,8,10,11,2,12,15,16,13,9,14,11,7,7,2,5}
                    Expected Result : {1, 3, 2, 13,5, 6,4,7,8,10,11,12,15,16,9,14}
                    Input : arr[] = {2}
                    Expected Result : {2}
                    Input : arr[] = {}
                    Expected Result : {}
                    Input : arr[] = {1, 3, 2, 5, 6,4}
                    Expected Result : {1, 3, 2, 5, 6,4}
                    Input : arr[] = {1, 2, 2}
                    Expected Result : {1, 2}
                    Input : arr[] = {1,2,-6,4,6,-6,0,3,99,-1,0}
                    Expected Result : {1,2,-6,4,6,0,3,99,-1}
                    Input : arr[] = null
                    Expected Result : null
                  */

    public static void main(String[] args) {
        int [] dupArr={1,2,-6,4,6,-6,0,3,99,-1,0};
        System.out.println(Arrays.toString(remove_Duplicates_Numbers_From_Array (dupArr)));
    }
    public static int [] remove_Duplicates_Numbers_From_Array (int [] dupArr){
        if(dupArr==null){ return null;}
        int index=0;
        int i,j;
            for(i=0;i<dupArr.length;i++){
                for(j=0;j<i;j++){
                    if(dupArr[j]==dupArr[i]){
                        break;
                       }
                }
                   if(j==i){ dupArr[index++]=dupArr[i];
                      }
            }
               int[] nondupArr= new int[index];
                   for(i=0;i<index;i++){
                       nondupArr[i]=dupArr[i];
                   }
        return nondupArr;
    }

}
