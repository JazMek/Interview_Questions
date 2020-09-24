package arrays_Questions;

public class Minimum_And_Maximum_Value_In_Array {
    /* Java programs to find the minimum and the maximum value in a given array:
     Write a methods to return the minimum and the maximum value in a given array.
     Note: Avoid using the in-built methods.
     Note: Use the in-built methods.
     Input :A[]={12,5,7,67,45}
     Expected Result : min=5,max=67
     Input :A[]={}
     Expected Result :null
     Input :null
     Expected Result :null
     Input :A[]={4}
     Expected Result :4,4
     */
    public static void main(String[] args) {
        int[] array = {4};
        System.out.println(maximum_Value(array));
        System.out.println(minimum_Value(array));
    }

    public static Integer maximum_Value(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static Integer minimum_Value(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min) {
                min = array[i];
            }
        }
        return min;
    }
}
