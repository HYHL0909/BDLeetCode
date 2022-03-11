package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        //如果长度不够三，则返回[]，记住不是返回null，
        if(nums.length<3)
            return res;

        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <nums.length-2; i++) {
//            因为已经排序过，因此第一个数如果大于0，则下一个也会大于0，因此加起来不会等于0
            if(nums[i]>0)
                break;
            //从a取第二个数开始时，要判断a是否有重复
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
//            在a的右边进行双指针
            int left=i+1;
            int right=nums.length-1;
            int temp=-nums[i];

//            双指针一般都是左指针小于右指针
            while(left<right)
            {
                if(nums[left]+nums[right]==temp){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //排除b相同的数
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    //排除c相同的数
                    while (left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }

                else if(nums[left]+nums[right]<temp){
                    left++;
                }

                else{
                    right--;
                }

            }

        }
        return  res;
    }
}
