package arrays_Questions;

import java.util.*;

public class Return_Duplicates_Numbers_From_Array {

          /*
          Java program to return the duplicates numbers from a given array of numbers:
          Write a method to return array of the duplicates numbers from a given array of numbers
          Note:
          Input : arr[] = {1,3,0,111,2,-4,4,5,6,4,1,-3,-4,0,100,111}
          Expected Result : {4, -4, 0, 111}
          Input : arr[] = {1, 3, 2, 13,5, 6,4,7,2,8,10,11,2,12,15,16,13,9,14,11,7,7,2,5}
          Expected Result : {2, 2, 13, 11, 7, 7, 2}
          Input : arr[] = {2}
          Expected Result : {}
          Input : arr[] = {}
          Expected Result : {}
          Input : arr[] = {1, 3, 2, 5, 6,4}
          Expected Result : {}
          Input : arr[] = {1, 2, 2}
          Expected Result : {2}
          Input : arr[] = {1,2,-6,4,6,-6,0,3,99,-1,0}
          Expected Result : {-6, 0}
          Input : arr[] = null
          Expected Result : null
         */

    public static void main(String[] args) {
        int [] givenArray={1, 3, 2, 13,5, 6,4,7,2,8,10,11,2,12,15,16,13,9,14,11,7,7,2,5};
        System.out.println("The given Array : "+Arrays.toString(givenArray));
        System.out.println(Arrays.toString(return_Duplicates_Numbers_From_Array(givenArray)));
        System.out.println(Arrays.toString(return_Duplicates_Numbers_From_Array_unique_numbers(givenArray)));
    }
    //     Method N:03
    public static int[] return_Duplicates_Numbers_From_Array_unique_numbers(int [] givenArray){
        if(givenArray==null){ return null;}
        int index=0;
        int index1=0;
        int i,j,k;
        for(i=0;i< givenArray.length;i++){
            for(j=0;j<i;j++){
                if(givenArray[j]==givenArray[i]){break;}
            }
            if(j!=i){givenArray[index++]=givenArray[i];}
        }
        for(i=0;i<index;i++){
            givenArray[i]=givenArray[i];
            for(j=0;j<i;j++){
                if(givenArray[j]==givenArray[i]){break;}
            }
            if(j==i){givenArray[index1++]=givenArray[i];}
        }
        int []dupArray= new int[index1];
        for(i=0;i<index1;i++){
            dupArray[i]=givenArray[i];}
        return dupArray;
    }
//     Method N:02
    public static int[] return_Duplicates_Numbers_From_Array(int [] givenArray){
        if(givenArray==null){ return null;}
        int index=0;
        int i,j;
        for(i=0;i< givenArray.length;i++){
            for(j=0;j<i;j++){
                if(givenArray[j]==givenArray[i]){givenArray[index++]=givenArray[i];break;}
            }
        }
           int []dupArray= new int[index];
        for(i=0;i<index;i++){
            dupArray[i]=givenArray[i];
        }
        return dupArray;
    }



//     Method N:03 Using HashSet  ===> it is not working need ibrahim help


}
