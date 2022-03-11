package day04;

import java.util.HashMap;

public class TwoSUm {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                res[0]=i;
                res[1]=map.get(temp);
                break;
            }
            map.put(nums[i],i);
        }
        return res;

    }
}
