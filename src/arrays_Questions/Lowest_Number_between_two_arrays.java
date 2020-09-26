package arrays_Questions;

public class Lowest_Number_between_two_arrays {
    /*
    Find the lowest difference between the two arrays cell.
    Ex: int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,1,41,47,17,36,14,19,30,2};
    The lowest number is =1
    Interview Question
    1-     Explain the SDLC phases
           SDLC Phases
            Given below are the various phases:
            Requirement gathering and analysis
            Design
            Implementation or coding
            Testing
            Deployment
            Maintenance

    2-     What happens in an agile sprint?
       . What have you completed, relative to the backlog, since the last Scrum meeting?
       . What obstacles got in your way of completing this work?
       .What specific things do you plan to accomplish, relative to the backlog,
         between now and the next Scrum meeting?
     */

    public static void main(String[] args) {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19,30,2};
        System.out.println(lowest_difference_between_two_arrays_cell(array1,array2));
        System.out.println(lowest_Difference_Between_Two_Arrays_Cell(array1,array2));
    }
//     Method N:01
    public static int lowest_difference_between_two_arrays_cell(int [] array1,int []array2){
        int length=array1.length+array2.length;
        int[] Unionarray =new int[length];
        for(int i=0;i<length;i++){
            if(i<array1.length){
                Unionarray[i]=array1[i];}
            if(i>=array1.length){
                Unionarray[i]=array2[i-array1.length];}
        }
        int cellDef= Unionarray[0];
        for(int i=0;i<length;i++){if(Unionarray[i]<cellDef){ cellDef= Unionarray[i];}}
        return cellDef;
        }
//     Method N:02
    public static int lowest_Difference_Between_Two_Arrays_Cell(int [] array1,int []array2){
        int length=array1.length+array2.length;
        int cellDef=array1[0];
        for(int i=0;i<length;i++){
            if(i<array1.length && array1[i]<cellDef){cellDef=array1[i];}
            if(i>=array1.length && array2[i-array1.length]<cellDef){cellDef=array2[i-array1.length];}
        }
        return cellDef;
    }
//     Method N:03
    public static int lowestNumber(int[] array1, int[] array2) {
               int lowest ;
               int lowest1 = array1[0];
               int lowest2 = array2[0];
               int i = 0;
               int j = 0;
            for (i = 0; i < array1.length; i++) {

              if (array1[i] < lowest1) {
                lowest1 = array1[i];
            for (j = 0; j < array2.length; j++) {
                if (array2[j] < lowest2) {
                    lowest2 = array2[j];
                }
              }

             }
           }

       if (lowest1 < lowest2) {
        lowest = lowest1;
        } else {
        lowest = lowest2;
        }
        return lowest;
      }

}
