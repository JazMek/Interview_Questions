package arrays_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Arrays_Union {
    /*
    Given 2 int[]
    Int A[] = {1,2,3,5,7,9}; and int B[] = {2,4,5,6,8,7,9,10};
    write a java code that gives A U B (U is symbol stand for Union)
    the Result should be A_U_B =[1,2,3,4,5,6,7,8,9,10];
    At least two ways to get the result A U B
     */

    public static void main(String[] args) {
        int[]A={1,2,3,5,7,9,10};
        int[]B={2,4,5,6,8,7,9,10,20,34};

        System.out.println(Arrays.toString(A_U_B_Using_TreeSet1(A,B)));
        System.out.println(Arrays.toString(A_U_B_Using_Iteration(A,B)));

    }

    public static int[] A_U_B_Using_TreeSet1(int[]A,int[]B){
        int lenhth=A.length+B.length;
        TreeSet<Integer> AUBlist =new TreeSet<>();
        for(int i=0;i<lenhth;i++){
            if(i<A.length){ AUBlist.add(A[i]);}
            if(i<B.length) {AUBlist.add(B[i]);}
        }
        Object [] AUBlistObj= AUBlist.toArray();
        int []AUB= new int[AUBlistObj.length];
        for(int i=0;i<AUBlistObj.length;i++){
            AUB [i]=(int)AUBlistObj[i];
        }
        return AUB;
    }
    public static int[] A_U_B_Using_Iteration(int[]A, int[]B){
            int length=A.length+B.length;
            int i,j;
            int [] AUBdup=new int [length];
            for(i=0;i<length;i++){
                if(i<A.length){AUBdup[i]=A[i];}
                if(i>=A.length){AUBdup[i]=B[i-A.length];}
//                int[]A={1,2,3,5,7,9,10};
//                int[]B={2,4,5,6,8,7,9,10,20,34};
//         int [] AUBdup={1,2,3,5,7,9,10 , 2,4,5,6,8,7,9,10,20,34}
//                          A.length     |            B.length
//                       >--------------<>-----------------------<
//                       0---------------------------------------length
            }
//        System.out.println(Arrays.toString(AUBdup));
            int index=0;
        for(i=0;i<length;i++){
            for(j=0;j<i;j++){
                if(AUBdup[j]==AUBdup[i]){break;}
            }
            if(j==i){AUBdup[index++] =AUBdup[i];}
        }
        int []AUB=new int[index];
        for(i=0;i<index;i++){
            AUB[i] =AUBdup[i];
        }
        Arrays.sort(AUB);
        return AUB;
    }

    }





