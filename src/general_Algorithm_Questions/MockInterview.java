package general_Algorithm_Questions;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MockInterview {

    public static void main(String[] args) throws InterruptedException {
//        2056,56,96,,45,48,9,3
//       Scanner sc =new Scanner(System.in);
//       System.out.println("Enter the number : ");
//             int max=sc.nextInt();
//        System.out.println(" The Max is: "+max);
//        System.out.println("Enter the number : ");
//       while (sc.hasNext()){
//              int max1=sc.nextInt();
//           if(max<max1){
//               max =max1;
//               System.out.println(" The Max is: "+max );
//               System.out.println("Enter the number : ");
//           }else {
//               System.out.println(" The Max is: " + max);
//               System.out.println("Enter the number : ");
//           }
//       }

//****************************************************************

        int x = 5; // wait 2 seconds at most
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int max=sc.nextInt();
        System.out.println(" The Max is: "+max);
        System.out.println("Enter the number : ");

        while ( sc.hasNext()) {
            long startTime = System.currentTimeMillis();
            Thread.sleep(300);
            System.out.println(System.currentTimeMillis() - startTime);
            if ((System.currentTimeMillis() - startTime)< x * 1000){
                int max1 = sc.nextInt();
                if (max < max1) {
                    max = max1;
                    System.out.println(" The Max is: " + max);
                    System.out.println("Enter the number : ");

                } else {
                    System.out.println(" The Max is: " + max);
                    System.out.println("Enter the number : ");}
                }else{ System.out.println("You did not enter data");
                    sc.close();}
        }

    }

}
