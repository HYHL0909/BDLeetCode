package day05;
import java.util.Arrays;
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int res=0;
        Arrays.sort(nums);
        res=nums[k];
        return res;


    }
}
