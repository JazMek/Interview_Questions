package general_Algorithm_Questions;

import java.util.Scanner;

public class Ibrahim_HomeWork {
    /*
   For a given array, write a program with two methods/functions.
   One function/method for sequential search The other function/method
   for Binary search The program to run as per the user’s section
   (if or switch statement to choose either Binary search or seq search).
   hint: create two arrays in main one array is already sorted, the other
   is not sorted and populate them (hard code) size = 20 for both
   int num[] = {3, 5, 7,8,...} Submit: the source code (the program)
   as either java or cpp NOT as a text or word or a pdf file submit the output
   for all different Scenarios (when target is found and when target is not found)
   for both algorithms.
  */
    public static void main (String [] args){
        int array1[] = { 2, 3, 4, 10, 40,56,66,76,88,120,555 };
        int target =40;
        Ibrahim_Programme ();


    }

    public static void Ibrahim_Programme (){
        final String S ="Sequential_Search";
        final String B ="Binary_Search";
        int i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome please choose the length of the Array: ");
        int length =sc.nextInt();
        int []array = new int[length];
        for(i=0;i<length;i++){
            System.out.println("Enter the Array element: ");
            array[i] =sc.nextInt();
        }
        System.out.println("Choose the Target element you are loking for :");
        int target =sc.nextInt();
        System.out.println("Choose your Searching Method for the list :");
        System.out.println("* for Sequential_Search use the character : S ");
        System.out.println("* for Binary_Search use the character     : B ");
        Scanner sc1 =new Scanner(System.in);
        String choose =sc1.nextLine();
        switch (choose){
            case S : Sequential_Search (array ,target);
            break;
            case B:
                int l = 0, r = array.length - 1;
                while (l <= r) {
                    int m = l + (r - l) / 2;
                    if (array[m] == target)
                        System.out.println("Element found at "
                                + "index " + m);
                    if (array[m] < target)
                        l = m + 1;
                    else
                        r = m - 1;
                }
                System.out.println("Element not present");
                break;

        }

    }
    public static void Sequential_Search (int [] array ,int target){
        int i;
        for(i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("The integer "+target+" is present in the Array : "+array+" at index : "+i);
                break;
            }
            else System.out.println("The integer "+target+" is not present in the Array: "+array);
        }

    }
    public static int Binary_Search (int [] array ,int target) {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == target)
                return m;
            if (array[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}



