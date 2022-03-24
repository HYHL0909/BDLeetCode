package day16;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        int[] res=new int[len-(k-1)];
        res[0]=getMax(nums,0,k);
        for (int i = 1; i < res.length; i++) {
            if(nums[i-1]!=res[i-1]){
                res[i]=Math.max(res[i-1],nums[k+i-1]);
            }
            else{
                if(nums[k+i-1]>=res[i-1]){
                    res[i]=nums[k+i-1];
                }
                else{
                    res[i]=getMax(nums,i,k+i);
                }
            }
        }
        return res;

    }

    private int getMax(int[] nums, int l, int r) {
        int max=nums[l];
        while(l<r){
            if(nums[l]>max){
                max=nums[l];
            }
            l++;
        }
        return max;
    }
}
