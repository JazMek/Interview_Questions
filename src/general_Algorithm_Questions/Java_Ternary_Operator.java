package general_Algorithm_Questions;

import java.util.Scanner;

public class Java_Ternary_Operator {
    /*
    Ternary operator in Java is used to replace if-else statement.
     The representation or the syntax for the ternary operator is given as:
     variable= (expression) ? expression true : expression false
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int A=sc.nextInt();
        System.out.println("Enter the value of B : ");
        int B=sc.nextInt();
        System.out.println("Chose the operation desired Q will be A+B else A-B : ");
        String Chose=sc.next();
        boolean result;
        int sum=A+B;
        int Result=sum;
        int def;
        int a=5;
        int b=8;
//        result= (Chose=="Q")?  Result=A+B :  Result =A-B ;


    }
}
