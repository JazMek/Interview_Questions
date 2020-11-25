package general_Algorithm_Questions;

import java.util.Scanner;

public class Java_Exemple {

    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the Number : ");
        int num=sc.nextInt();
       for(int j=num;j>1;j--){  //  num = 13 , i=12 ,j=13
           boolean isPrime=true;
           int i=j-1;
        while(i>1){
            if(j%i ==0){isPrime=false;}
            i--;
            }
        if(isPrime){
            System.out.println(" The prime number is : "+j);
           }
       }
    }
}
