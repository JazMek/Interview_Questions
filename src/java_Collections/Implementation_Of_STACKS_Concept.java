package java_Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation_Of_STACKS_Concept {
    static int count = -1;
    public static void main(String[] args) {
        implement_STACKS_Concept_Program();

    }
    public static void implement_STACKS_Concept_Program() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("************************** Welcome to the STACKS Concept Implementation Program **************************");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int[] stackArray = new int[10];
        boolean flag = false;
        int choce;
        menu(sc);
        System.out.println("Entre your choice :");

        choce = sc.nextInt();
        while (choce==1||choce==2||choce==3||choce==4||choce==5)
        {
            switch (choce) {
                case 1:
                    create(sc);
                    menu(sc);
                    System.out.println("Entre your choice :");
                    choce = sc.nextInt();
                    break;
                case 2:
                    push(stackArray, sc);
                    menu(sc);
                    System.out.println("Entre your choice :");
                    choce = sc.nextInt();
                    break;

                case 3:
                    pop(stackArray);
                    menu(sc);

                    System.out.println("Entre your choice :");
                    choce = sc.nextInt();
                    break;
                case 4:
                    top(stackArray);
                    menu(sc);
                    System.out.println("Entre your choice :");
                    choce = sc.nextInt();
                    break;
                case 5:
                    purge(stackArray);
                    menu(sc);
                    System.out.println("Entre your choice :");
                    choce = sc.nextInt();
                    break;
                case 6: return;
            }

     }
    }

    public static void menu(Scanner sc) {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Select the action you wold like to perform from the below menu : ");
        System.out.println("   -) Select << 1 >> ----> to << create >> a new stack. ");
        System.out.println("   -) Select << 2 >> ----> to << push >> push an item on the stack. ");
        System.out.println("   -) Select << 3 >> ----> to << pop >> pop an item off the stack. ");
        System.out.println("   -) Select << 4 >> ----> to << top >> display the top of the stack. ");
        System.out.println("   -) Select << 5 >> ----> to << purge >> check if stack is empty. ");
        System.out.println("   -) Select << 6 >> ----> to << Exit  >> from the program. ");
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    public static int[] create(Scanner sc) {
        System.out.println("Entre the number of elements the new stack will contain: ");
        int arrayLength = sc.nextInt();
        int[] stackArray = new int[arrayLength];
        System.out.println(" ====> The stack is created successfully.");
        System.out.println();
        return stackArray;
    }
    public static void push(int[] stackArray, Scanner sc) {
        if (count != stackArray.length) {
            System.out.println("Entre the item you want to push to the stack: ");
            Integer item = sc.nextInt();
            count++;
            stackArray[count] = item;
            System.out.println("push" + Arrays.toString(stackArray));
            System.out.println("The item  : " + item + " is pushed  successfully");
        } else System.out.println("<< Overflow !!  >>> ----> The stock is full.");

    }
    public static void pop(int[] stackArray) {
        if (count !=-1) {
            System.out.println(stackArray[count]);
            count--;
        }else System.out.println("<< Underflow !! >>----> The stock is empty.");
       }

    public static void top(int[] stackArray) {
        if (count != -1) {
            System.out.println(stackArray[count]);
        } else System.out.println("<< Underflow !! >>");
    }

    public static void purge(int[] stackArray) {
        boolean empty = false;
        if (count == -1) {
            empty = true;
            System.out.println("The purge is empty : " + empty);
        } else System.out.println("The purge is empty : " + empty);
    }
}