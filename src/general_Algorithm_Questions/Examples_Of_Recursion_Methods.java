package general_Algorithm_Questions;

public class Examples_Of_Recursion_Methods {
    /*
    Java program to explain the use of the recursion methods in java :
    Write a java program to calculate the some of all the numbers  of a given number using Recursion as well as Iteration.
    */

    public static void main(String[] args) {
        int x =3 ;
        System.out.println(sum_Using_Iteration(x));
        System.out.println(sum_Using_Recursion(x));
        System.out.println(sum_Using_Recursion_2(x));

    }
    public static int sum_Using_Iteration (int k) {
       int sum=0;
       for(int i =0;i<=k;i++){
           sum=sum+i;
       }
            return sum;


    }
    public static int sum_Using_Recursion (int k) {
        if (k > 0) {
            return k + sum_Using_Recursion(k - 1);
        } else {
            return 0;
        }
    }
    public static int sum_Using_Recursion_2 (int k) {
//        if(k==0){return 0;}

        int sum=0;
//        while ((i-1)< k) {
//            sum = i + sum_Using_Recursion_2 (i+1);
//            i++;
//        }
        for(int i =k;i>=k;i--){
            sum=sum+sum_Using_Recursion_2 (i-1);
        }
        return sum;
    }
}
