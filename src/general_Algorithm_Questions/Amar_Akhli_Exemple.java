package general_Algorithm_Questions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Amar_Akhli_Exemple {

    /*
      Teena finally reaches the shopping Mall in her Audi and she gets down
      at the entrance and she asks the driver to park the car in the first
      freely parking space(if it’s available) or  at the adjacent to the mall.
      The driver asks her to give them a call when she is done with her
      shopping and leaves to park the car. Suddenly Tintu rememberers that she
      has left her mobile at home. She sees a display board at the mall entrance
      that gives the status of the occupancy of the parking lot.
      There are 4 basements —B1,B2,B3, and B4.
      Assuming that only when B1 is full, cars would be allowed to be parked in B2 and so on.
      The number cars that can be parked in the basements B1,B2,B3 and B4 are N1,N2,N3 and N4.
      The total number of cars parked in the parking lot currently is N.
      The values of N1,N2,N3,N4 and N displayed in the giant display board in the mall entrance.
      Help Tintu in quickly deciding where Rahgav would have parked the car.
      For the negative inputs display the error “<Input> is  not valid input”.
      If car count is greater than the sum of cars can be parked within 4 basements,
      then display “Parking slots in full”.
      Simple Input 1:
      B1——>50
      B2——>50
      B3——>40
      B4——>40
      Car count
      120
      Simple output 1:
      The car can be parked at B3.

      Simple Input 2:
      B1——>50
      B2——>50
      B3——>40
      B4——>40
      Car count
      180
     Simple output 2:
     The car can be parked at B4.

     Simple Input 3:
     B1——>50
     B2——>50
     B3——> -30
     Simple output 3:
     -30 is not a valid input.

     Simple Input 4:
     B1——>50
     B2——>50
     B3——>40
     B4——>40
     Car count
     181
     Simple output 4:
     Parking slots in full.
     */


    public static void main(String[] args) throws InterruptedException {
        Parking_Display_Board();



    }
       public static void Parking_Display_Board() throws InterruptedException {
        String respense="";
        int N=0;
        int N1=45;
        int N2=45;
        int N3=45;
        int N4=45;
        int B1=0;
        int B2=0;
        int B3=0;
        int B4=0;
        int x;

           do{
               System.out.println("**********************************************************************************************");
               System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Welcome to KARIM parking's<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
               System.out.println("**********************************************************************************************");
               Scanner sc= new Scanner(System.in);
               System.out.println("Entre the B1 capacity : ");
               B1 =sc.nextInt();
            if(B1>=0) {
                System.out.println("Entre the B2 capacity : ");
                B2 =sc.nextInt();
                if(B2>=0) {
                    System.out.println("Entre the B3 capacity : ");
                    B3 =sc.nextInt();
                if(B3>=0) {
                    System.out.println("Entre the B4 capacity : ");
                    B4 =sc.nextInt();
                if(B4>=0) {
                    System.out.println("Entre the the count :");
                    N=sc.nextInt();
                    if(N<N1){
                        System.out.println("Car count is: "+N);
                        System.out.println("The car can be parked at B1.");
                    }
                    else if(N<(N1+N2) ){
                        System.out.println("Car count is: "+N);
                        System.out.println("The car can be parked at B2.");
                    }else if(N<(N1+N2+N3) && N>(N1+N2)){
                        System.out.println("Car count is: "+N);
                        System.out.println("The car can be parked at B3.");
                    }else if(N<=(N1+N2+N3+N4) && N>(N1+N2+N3)){
                        System.out.println("Car count is: "+N);
                        System.out.println("The car can be parked at B4.");
                    }else System.out.println("Parking slots in full.");
                }else System.out.println("\"<"+B4+"> is  not valid input\"");
                }else System.out.println("\"<"+B3+"> is  not valid input\"");
                }else System.out.println("\"<"+B2+"> is  not valid input\"");
            }else System.out.println("\"<"+B1+"> is  not valid input\"");
            System.out.println("Do you want to Restart the Program? if Yes entre << Y >> ,if No entre << N >>");
            respense=sc.next();
//             x=Wat_for(10);

        }while (respense.equalsIgnoreCase("Y") );


       }

       public static int Wat_for(int i) throws InterruptedException {
           int j;
        for(j=20;j>0;j--){
        Thread.sleep(i);
        }
        return j;
       }
}
