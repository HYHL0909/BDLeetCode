package day13;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if(nums.length==1)
            return;
        int r = nums.length - 2;
        System.out.println(r);
        while (r >= 0 && nums[r] >=nums[r+1]) {
            r--;
        }
        System.out.println(r);
        //获得的r是从左到右第一个小于左边相邻的数的index
        //除了递增序列，【1，2，3，4】在递增序列中，获得的r是指向第二个。

        //如果获得的r是-1，那么说明是【4，3，2，1】是递减数列，此时应该要排序
        if (r >= 0) {
            int p = nums.length - 1;
            while (p > r && nums[p] <= nums[r]) {
                p--;
            }
            int temp = nums[r];
            nums[r] = nums[p];
            nums[p] = temp;
        }
        Arrays.sort(nums,  r+1, nums.length);

    }
}
