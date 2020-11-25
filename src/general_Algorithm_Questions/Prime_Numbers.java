package general_Algorithm_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prime_Numbers {
       /*
       Find list of Prime numbers from number 2 to given number.
       ex: int Number= 40 ;

      */

    public static void main(String[] args) {
        int n = 13;

        System.out.println(prime_Numbers_ArrayList(n));
//        System.out.println(Arrays.toString(prime_Numbers_Array(n)));
    }
    public static void prime_Numbers() {
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

    public static ArrayList prime_Numbers_ArrayList(int n) {
        ArrayList prime_Num = new ArrayList<>();
        int count ;
        for (int i = 0; i <= n; i++) {
            count =0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime_Num.add(i);
            }
        }
        return prime_Num;
    }
//    public static int[] prime_Numbers_Array(int n){
//        int count=0;
//        int i,j;
//        int []array= new int [n];
//        for(i=0;i<=n;i++){
//            array[i]=i;
//            for (j=0;j<i;j++)
//            if(i%2!=0){
//                break;
//            }
//            if(j==i){array[count++]=array[i];}
//        }
//        int [] prime_Num = new int[count];
//        for(i=0;i<count;i++){
//            if(i%2!=0){
//                prime_Num[i]=array[i];
//            }
//        }
//        return prime_Num;
//    }
}
