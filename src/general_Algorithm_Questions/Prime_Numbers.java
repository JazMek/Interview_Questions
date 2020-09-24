package general_Algorithm_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime_Numbers {
       /*
       Find list of Prime numbers from number 2 to given number.
       ex: int Number= 40 ;

      */

    public static void main(String[] args) {
        int n = 40;

        System.out.println(prime_Numbers_ArrayList(n));
//        System.out.println(Arrays.toString(prime_Numbers_Array(n)));
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
