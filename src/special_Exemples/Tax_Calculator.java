package special_Exemples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Tax_Calculator  extends Employees{
    /*
    Write a Java program to create a payroll report based on the following assumptions and requirements:
    A company called Data Housing Corp. employs  10 employees, all employees are paid  per hour (hourly base)
    , employees who works over than 40 hours are entitled to be paid overtime (1.5 for every hour exceeding 40).

    Calculate:
    The Gross income: Gross income = (Rate * hours worked) + over time.
    The Overtime: Overtime = number of hours exceeding 40 * Rate* 1.5
    State Tax :     State Tax = gross * 6%  (declare as a constant)
    Federal Tax:    Fed Tax = Gross * 12%  (declare as a constant)
    Union fees:    Union Fees = Gross * 2% (declare as a constant)
    Net :             Net = Gross – (state tax + fed tax + Union fees).
    Total Gross for all employees.
    Average Gross.
    Directions:

    Your input consists of : Employee First Name, Middle Initial, Last name, Hours worked, Rate Per Hour.
    State tax, Fed tax and Union fees are constants.
    Your Output includes all input information plus all calculated information such as( gross, net. .. etc.)
    Apply (whatever is applicable) : Loops,  constants, data validation , if, else, switch …. .
    input validation (hours between 0 and 60, Rate per hour ($15.00 -$50.00 )
    Document your program.  (include many comments)
     */
    static double Total_Groos=0;
    static double Average_Gross=0;
    static double over_Time;
    static double over_Time_pay;
    static final double state_tax = 0.06;
    static final double fed_tax = 0.12;
    static final double union_fees = 0.02;
    static double state_tax_deduction;
    static double fed_tax_deduction;
    static double union_fees_deduction;
    static int counter = 1;
    static String doYouWantToContinue = "";

    public static void main(String[] args) {
    List<Employees> employeesList =new ArrayList<Employees>();

    do {
        Employees employee= new Employees();
        Scanner sc = new Scanner(System.in);
        System.out.println(".............. WELCOME ............");
        System.out.println("Please Enter Employee First Name : ");
        employee.setEmployee_First_Name(sc.next());
        System.out.println("Please Enter Employee Middle Initial: ");
        employee.setMiddle_Initial(sc.next());
        System.out.println("Please Enter Employee Last Name: ");
        employee.setLast_name(sc.next());
        System.out.println("Please Enter Hours Worked: ");

      double  hours_Worked = sc.nextDouble();
// !(hours_worked >=0 && hours_worked <= 60)

/** Lambda Expression */
        Predicate<Double> p = hw -> (hw < 0 || hw > 60);
//hours_worked < 0 || hours_worked > 60
        while(p.test(hours_Worked)){
            System.out.println("The Hours Worked Must be in between 0 to 60h , Reenter The Correct Number");
            hours_Worked = sc.nextDouble();
        }
        employee.setHours_worked(hours_Worked);
        System.out.println("Please Enter Rate Hour: ");
        employee.setRate_Hour(sc.nextDouble());
// calculate Gross : The Gross income: Gross income = (Rate * hours worked) + over time.
        if (employee.getHours_worked() > 40){
//Overtime = number of hours exceeding 40 * Rate* 1.5
            over_Time = employee.getHours_worked()  - 40;
            over_Time_pay = over_Time * employee.getRate_Hour() * 1.5;
        }
        employee.setEmployee_gross((employee.getHours_worked()* employee.getRate_Hour()) + over_Time_pay);

// Taxes :State Tax = gross * 6%
// Federal Tax: Fed Tax = Gross * 12%
// Union fees: Union Fees = Gross * 2%
        state_tax_deduction = employee.getEmployee_gross() * state_tax;
        fed_tax_deduction = employee.getEmployee_gross()  * fed_tax;
        union_fees_deduction = employee.getEmployee_gross()  * union_fees;

// Net Pay : Net = Gross – (state tax + fed tax + Union fees).
        employee.setEmployee_net_Pay(employee.getEmployee_gross()-(state_tax_deduction + fed_tax_deduction + union_fees_deduction));

// Average Gross :
        employeesList.add(new Employees((employee.getEmployee_First_Name()),(employee.getMiddle_Initial()),(employee.getLast_name()),(employee.getHours_worked()),(employee.getRate_Hour()),(employee.getEmployee_gross()),employee.getEmployee_net_Pay()));
        System.out.println("Do You Want To Add An Employee Tap \"Y\" Yes or Any character for NO");
        doYouWantToContinue = sc.next();

    }while (doYouWantToContinue.equalsIgnoreCase("y"));
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","|---------------------|","|-------------------------|","|--------------------|","|-----------------------|","|--------------------|","|-------------|","|---------------|");    //System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","-------------------|"+Exp_Formator("Employee First Name"),"|-----------------------|"+Exp_Formator("Employee Middle Initial"),"|------------------|"+Exp_Formator("Employee Last Name"),"|---------------------|"+Exp_Formator("Employee Hours worked"),"|------------------|"+Exp_Formator("Employee Rate Hour"),"|-----------|"+Exp_Formator("Total_Gross"),"|-------------|"+Exp_Formator("Average_Gross"));
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","| Employee First Name |","| Employee Middle Initial |","| Employee Last Name |","| Employee Hours worked |","| Employee Rate Hour |","| Total_Gross |","| Average_Gross |");
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","|---------------------|","|-------------------------|","|--------------------|","|-----------------------|","|--------------------|","|-------------|","|---------------|");
         for(Employees myList :employeesList){
    Total_Groos=Total_Gross_Calculator (myList.getEmployee_gross(),employeesList.size());
    Average_Gross=Average_Gross_Calculator(myList.getEmployee_gross(),employeesList.size());

    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n",myList.getEmployee_First_Name()+Exp_Formator(myList.getEmployee_First_Name(),"| Employee First Name |",-1),myList.getMiddle_Initial()+Exp_Formator(myList.getMiddle_Initial(),"| Employee Middle Initial |",0),myList.getLast_name()+Exp_Formator(myList.getLast_name(),"| Employee Last Name |",1),myList.getHours_worked()+Exp_Formator(myList.getHours_worked(),"| Employee Hours worked |",2),myList.getRate_Hour()+Exp_Formator(myList.getRate_Hour(),"| Employee Rate Hour |",3),Total_Groos+Exp_Formator(Total_Groos,"| Total_Gross |",4),Average_Gross+Exp_Formator(Average_Gross,"| Average_Gross |",5));

//    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n",myList.getEmployee_First_Name()+Exp_Formator("Employee First Name"),myList.getMiddle_Initial()+Exp_Formator("Employee Middle Initial"),myList.getLast_name()+Exp_Formator("Employee Last Name"),myList.getHours_worked()+Exp_Formator("Employee Hours worked"),myList.getRate_Hour()+Exp_Formator("Employee Rate Hour"),Total_Groos+Exp_Formator("Total_Gross"),Average_Gross,Exp_Formator("Average_Gross"));
    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","|---------------------|","|-------------------------|","|--------------------|","|-----------------------|","|--------------------|","|-------------|","|---------------|");   // System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s%s\n","|-------------------|"+Exp_Formator("Employee First Name"),"|-----------------------|"+Exp_Formator("Employee Middle Initial"),"|------------------|"+Exp_Formator("Employee Last Name"),"|---------------------|"+Exp_Formator("Employee Hours worked"),"|------------------|"+Exp_Formator("Employee Rate Hour"),"|-----------|"+Exp_Formator("Total_Gross"),"|-------------|"+Exp_Formator("Average_Gross"));
//    System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s%s\n", "Employee First Name: "+myList.getEmployee_First_Name()+Exp_Formator(myList.getEmployee_First_Name()),"Employee Middle Initial: "+myList.getMiddle_Initial()+Exp_Formator(myList.getMiddle_Initial()),"Employee Last Name: "+myList.getLast_name()+Exp_Formator(myList.getLast_name()),"Employee Hours worked: "+myList.getHours_worked(),"Employee Rate Hour: "+myList.getRate_Hour(),"  The Total_Gross is : "+Exp_Formator("The Total_Gross is : ")+Total_Groos+Exp_Formator(Total_Groos),"  The Average_Gross is : "+Exp_Formator("  The Average_Gross is : ")+Average_Gross,Exp_Formator(Average_Gross));
         }

      }





    public static double Total_Gross_Calculator(double grooss ,int counter){
        double total_gross = 0;
        total_gross = total_gross + grooss;
        return total_gross;
    }
      public static double Average_Gross_Calculator(double grooss ,int counter){
           double average_Gross = 0;
           double total_gross = 0;
          total_gross = total_gross + grooss;
          average_Gross = total_gross / counter;
          return average_Gross;
      }
    public static String Exp_Formator(String toFormat ,String Reference,int Position){
        String formateur="";
        Predicate<String> p= s->s.length()<Reference.length();
        if(p.test(toFormat)){
            int x=Reference.length()-toFormat.length()-Position;
            for(int i=0;i<=x;i++){
                formateur=formateur+" ";
            }
        }
        return formateur;
    }
    public static String Exp_Formator(double toFormat,String Reference,int position){
        String formateur="";
        String toformat=Double.toString(toFormat);
        Predicate<String> p= s->s.length()<Reference.length();
        if(p.test(toformat)){
            int x=Reference.length()-toformat.length()-position;
            for(int i=0;i<=x;i++){
                formateur=formateur+" ";
            }
        }
        return formateur;
    }

}

