package general_Algorithm_Questions;

public class Java_For_Loops {
    /*

      1) Infinite loop:
            Method N1: for ( ; ; ) is similar to while(true)
            Method N2: for ( int i=0; ; i++)
      2) Initializing multiple variables:
         for( int X2=0,Z=0 ; X1<10 && X2<10 ; X1++,X2++ )
      3)
     */
    public static void main(String[] args) {

        int i,j,k;
        for(i=0,j=10,k=10; i<10 && j>0 && k>0;i++ ,j--,k++){
            System.out.println();
            System.out.print("i = "+i);
            System.out.println();
            System.out.print("j = "+j);
            System.out.println();
            System.out.print("k = "+k);
        }
    }
}
