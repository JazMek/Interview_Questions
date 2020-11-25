package general_Algorithm_Questions;

import java.util.Scanner;

public class Mega_Mart_Discount {

    public static void main(String[] args) {
        System.out.println("Entre the Customer Id : ");
        Scanner scanner =new Scanner(System.in);
        int customer_Id = scanner.nextInt();
        if(customer_Id<=0){
            System.out.println(customer_Id +" is not a valid Customer Id.");
            return;
        }
        System.out.println("Entre the Bill amount : ");
        double Bill_amount = scanner.nextDouble();
        if(Bill_amount<=0){
            System.out.println(Bill_amount +" is not a valid Bill amount.");
            return;
        }
         else if(Bill_amount>=1000) {
            String Customer_type="";
            double  Discount_Percentage;
            double  New_Bill_amount;
             if (customer_Id >= 1 && customer_Id <= 100) {Customer_type="Bronze";}
             if (customer_Id >= 101 && customer_Id <= 250) {Customer_type="Server";}
             if (customer_Id >= 251 && customer_Id <= 500) {Customer_type="Gold";}
             if (customer_Id >= 501 && customer_Id <= 1000) {Customer_type="Platinum";}
             if (customer_Id >= 1001) {Customer_type="Diamante";}
            switch (Customer_type) {
                case "Bronze":{
                        Discount_Percentage = 15;
                        New_Bill_amount = Bill_amount - (Bill_amount * 15 / 100);
                        System.out.printf("%.2f",New_Bill_amount);
                        break;}
                case "Server":{
                        Discount_Percentage = 18;
                        New_Bill_amount = Bill_amount - (Bill_amount * 18 / 100);
                        System.out.printf("%.2f",New_Bill_amount);
                            }
                case "Gold":{
                        Discount_Percentage = 23;
                        New_Bill_amount = Bill_amount - (Bill_amount * 23 / 100);
                        System.out.printf("%.2f",New_Bill_amount);
                        break;}
                case "Platinum":{
                        Discount_Percentage = 28;
                        New_Bill_amount = Bill_amount - (Bill_amount * 28 / 100);
                        System.out.printf("%.2f",New_Bill_amount);
                        break;}
                case "Diamante":{
                        Discount_Percentage = 32;
                        New_Bill_amount = Bill_amount - (Bill_amount * 32 / 100);
                        System.out.printf("%.2f",New_Bill_amount);
                        break;}
//               default:System.out.printf("%.2f",Bill_amount);
              }
            }else System.out.printf("%.2f",Bill_amount);
         }
}
