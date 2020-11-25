package general_Algorithm_Questions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Implement_The_STACKS_Concept {

/*
Write a java or a CPP program to implement the STACKS concept
Use ONLY arrays , functions(methods), loops, if or switch statements NOOO classes, or structures.
the user is to select a choice from a menu to call any of the following functions:
create(s);
push(s,i) <<<== before pushing an item on the stack, make sure that the stack is not full.
pop(s,i), <<<= before popping an item off the stack make sure that the stack is not empty
top(s) << == before displaying the top of the STACK make sure that the stack is not empty
purge(s)
check if stack is empty empty(s).
submit: the source code and the output of ALLLL scenarios
one copy for those working in groups
late submission will not be accepted
 */
    public static void main(String[] args) {

     }

     public static void STACKS_Concept(){

        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the size of the Stack: ");
        int Ssize =sc.nextInt()+5;

        int[] SArray =new int[Ssize];
        int i;
        Object element;
        for(i=0;i<Ssize;i++){
            System.out.println("Entre the element of the Stack: ");
            element=sc.nextBigInteger();
        }







     }
}