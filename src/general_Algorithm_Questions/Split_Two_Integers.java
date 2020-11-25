package general_Algorithm_Questions;

public class Split_Two_Integers {
    /*
    Java program to split an integer :
    Write a method to split a given number in tow separated integer.
    Input : int num= 24
    Expected Result :   int A=2 ,int B=4
     */
    public static void main(String[] args) {
        int num= 109;
        split_Integer(num);
        split_Integers(num);
        split_integers(num);
        Split_Integers(num);
        split_Number(num);

    }
//    Method N:01
    public static void split_Integer(int num){
        int A,B;
        A=num/10;
        B=num%10;
        System.out.println(A);
        System.out.println(B);
    }
//    Method N:02
    public static void Split_Integers(int num){
        int A,B;
        A=num/10;
        B=num-(A*10);
        System.out.println(A);
        System.out.println(B);
    }
//    Method N:03
    public static void split_Integers(int num){
        int A,B;
        A=Integer.divideUnsigned(num,10);
        B=num-(A*10);
        System.out.println(A);
        System.out.println(B);
    }
//    Method N:04
    public static void split_integers(int num){
        int A,B;
        String Astr="",Bstr="";
        char [] numchar=Integer.toString(num).toCharArray();
        Astr=Astr+numchar[0];
        Bstr=Bstr+numchar[1];
        A=Integer.parseInt(Astr);
        B=Integer.parseInt(Bstr);
        System.out.println(A);
        System.out.println(B);
    }
//    Method N:05
    public static void split_Number(int num){
        while(num>0){
            System.out.print(num%10 +" ");
            num=num/10;
        }
    }
}
