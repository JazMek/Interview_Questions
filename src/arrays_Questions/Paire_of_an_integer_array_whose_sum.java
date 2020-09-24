package arrays_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Paire_of_an_integer_array_whose_sum {
    //    How do you find all pairs of an integer array whose sum is equal to a given number?
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                61,62,63,64,65,66,67,68,70,71,72,73,74,75,76,77,78,79,80,
                81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        paire_of_an_integer(array,17);
        int[] nums = {34,50,20,60,7,8,15};
        int target = 65;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        int [] numbers={0, 5,7, 8, 1, 9, 13 };
        System.out.println(Arrays.toString(twoSum( numbers, target)));
    }


    public static void paire_of_an_integer(int [] array,int sum){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]+array[j]==sum){
                    System.out.println("The paire of integer whose sum is equal to "+sum+" are "+array[i]+" and "+array[j]);

                }
            }
        }
    }


    public static int[] two_Sum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int nums[], int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                return result;

            } else
                map.put(nums[i], i);
        }
        return result;
    }

}
