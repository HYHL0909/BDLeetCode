package day06;

public class Search {
    public int search(int[] nums, int target) {
        if(nums.length==1)
            return nums[0]==target?0:-1;
        int res=0;
        res=searchsub(nums,0,nums.length-1,target);
        return res;
    }

    private int searchsub(int[] nums, int left, int right, int target) {
        if(left>=right) return target==nums[left]?left:-1;
        int mid=left+(right-left)/2;
        if(nums[mid]>nums[left]){
//            左边有序
            if(nums[left]<=target&&target<=nums[mid])
                //且在有序的这部分
                return binarySearch(nums,left,right,target);
            return searchsub(nums,mid+1,right,target);
        }
        else{
            //右边有序
            if(nums[mid+1]<=target&&target<=nums[right])
                return binarySearch(nums,mid+1,right,target);
            return searchsub(nums,left,mid-1,target);
        }

    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        if(left>=right)
            return target==nums[left]?left:-1;
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]<target)
            return binarySearch(nums,mid+1,right,target);
        return binarySearch(nums,left,mid-1,target);
    }
}
