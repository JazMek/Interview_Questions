package general_Algorithm_Questions;

public class Homme_work7 {
    public static void main (String [] args){
        int []arr ={};

        MaxAndMin(arr);

    }

    public static void MaxAndMin(int []arr){
        if(arr.length==0){System.out.println( "the array is empty"); return;}
        int max=arr[arr.length-1];
        int min=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}
            if(arr[i]<min){min=arr[i];}
        }
        System.out.println("The max is: "+max);
        System.out.println("The min is: "+min);
    }
}
