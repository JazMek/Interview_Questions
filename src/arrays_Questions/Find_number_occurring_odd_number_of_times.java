package arrays_Questions;

public class Find_number_occurring_odd_number_of_times {
    public static void main(String[] args) {
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println(find_number_occurring_odd_number_of_times(array));

    }
    public static int find_number_occurring_odd_number_of_times(int []array){
        int count=0;
        int num=0;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if( array[i]==array[j])
                    count++;
                if(count%2!=0) num=array[i];
            }
        }
        return  num;
    }
}
