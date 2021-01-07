package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String []args){
        int[] nums = {1,3,4,2};
        System.out.println(Arrays.toString(twoSumSol(nums, 6)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] res = null;
        for(int i=0; i < nums.length; i++){
            for(int j=1; j < nums.length; j++){
                if((nums[i] + nums[j] == target) && (i != j) ){
                    res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    System.out.println(i);
                    System.out.println(j);
                }
            }
            if(res != null) break;
        }
        return  res;
    }

    public static int[] twoSumSol(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
