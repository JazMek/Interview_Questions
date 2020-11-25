package java_Collections;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Implementation_Of_The_STACKS_Concept {

    /*
    Write a java or a CPP program to implement the STACKS concept Use ONLY arrays ,
     functions(methods), loops, if or switch statements NOOO classes, or structures.
     the user is to select a choice from a menu to call any of the following functions:
     create(s);
     push(s,i) <<<== before pushing an item on the stack,make sure that the stack is not full.
     pop(s,i), <<<= before popping an item off the stack make sure that the stack is not empty.
     top(s) << == before displaying the top of the STACK make sure that the stack is not empty.
     purge(s) check if stack is empty empty(s).
     */

//    public static void main(String[] args) {
//        implement_STACKS_Concept_Program ();
//
//    }
//        public static  void implement_STACKS_Concept_Program () {
//            System.out.println("----------------------------------------------------------------------------------------------------------");
//            System.out.println("************************** Welcome to the STACKS Concept Implementation Program **************************");
//            System.out.println("----------------------------------------------------------------------------------------------------------");
//            Scanner sc = new Scanner(System.in);
//            Integer[] stackArray= new Integer[6];
//            boolean flag = false;
//            int choce;
//            menu(sc);
//            System.out.println("Entre your choice :");
//
//            choce = sc.nextInt();
//            do {
//                switch (choce) {
//                    case 1:
//                        create(sc);
//                        menu(sc);
//                        System.out.println("Entre your choice :");
//                        choce = sc.nextInt();
//                        break;
//                    case 2:
//                        push(stackArray, sc);
//                        menu(sc);
//                        System.out.println("Entre your choice :");
//                        choce = sc.nextInt();
//                        break;
//
//                    case 3:
//                        pop(stackArray);
//                        System.out.println(pop(stackArray));
//                        menu(sc);
//
//                        System.out.println("Entre your choice :");
//                        choce = sc.nextInt();
//                        break;
//                    case 4:
//                        top(stackArray);
//                        menu(sc);
//                        System.out.println("Entre your choice :");
//                        choce = sc.nextInt();
//                        break;
//                    case 5:
//                        purge(stackArray);
//                        menu(sc);
//                        System.out.println("Entre your choice :");
//                        choce = sc.nextInt();
//                        break;
//
//                }
//                System.out.println("Do you want to continue Entre Y for yes  or any key for no");
//                if(sc.nextLine().equalsIgnoreCase("Y")){ flag=true;}
//            }while (!flag);
//        }
//
//
//   public static void menu (Scanner sc){
//       int chose;
//       System.out.println("Select the action you wold like to perform from the below menu : ");
//       System.out.println( "   -) Select << 1 >> ----> to << create >> a new stack. ");
//       System.out.println( "   -) Select << 2 >> ----> to << push >> push an item on the stack. ");
//       System.out.println( "   -) Select << 3 >> ----> to << pop >> pop an item off the stack. ");
//       System.out.println( "   -) Select << 4 >> ----> to << top >> display the top of the stack. ");
//       System.out.println( "   -) Select << 5 >> ----> to << purge >> check if stack is empty. ");
//   }
//
// public static Integer[] create(Scanner sc){
//     System.out.println("Entre the number of elements the new stack will contain: ");
//     int arrayLength = sc.nextInt();
//     Integer []stackArray = new Integer[arrayLength];
//     System.out.println("The stack is created successfully.");
//     return stackArray;
// }
//    public static void push(Integer[]stackArray , Scanner sc) {
//        System.out.println("Entre the item you want to push to the stack: ");
//        Integer item = sc.nextInt();
//        for (int i = 0; i < stackArray.length; i++) {
//            if (stackArray[i] == null) {
//                stackArray[i] = item;
//                break;
//            }
//        }
//        System.out.println("push"+Arrays.toString(stackArray));
//        System.out.println("The item  : " + item + " is pushed  successfully");
//    }
//
//    public static Integer pop(Integer[]stackArray){
//        int temp=0;
//        if(stackArray.length!=0) {
//            for(int i=stackArray.length-1;i>=0;i--){
//                if(stackArray[i]!=null){
//            temp = stackArray[i];
//            stackArray[i] = null;}
//             break;}
//            for(int i=stackArray.length-1;i>=0;i--){
//                stackArray[i] =stackArray[i-1];
//            }
//
//            System.out.println("POP"+Arrays.toString(stackArray));
//            System.out.println(temp);
//        }return  temp;
//    }
//     public static void top(Integer[]stackArray){
//         if(stackArray.length!=0){
//             for(int i=stackArray.length-1;i>0;i--){
//                 if (stackArray[i] != null) {
//                     System.out.println("The top of the stack is : "+stackArray[i]);
//                     break;
//                 }
//             }
//         }
//     }
//
//     public static void purge(Integer[]stackArray){
//        boolean full=true;
//        int count=0;
//         for (Integer item:stackArray) {
//             if(item == null){count++;}
//         }
//         if(count!=0){full=false;}
//         System.out.println("The purge is full : "+full);
//     }
}