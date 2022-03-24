package day13;

public class MediaNum {
    //思路：
    //寻找中间数
    //分奇数和偶数，奇数找一个，偶数找两个。
    //利用两个指针的方式。合并到要找的数就可以了。
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] nums=new int[len1+len2];
        int p1 = 0;
        int p2 = 0;
        int count=0;
        while (p1 < len1 && p2 < len2) {
            if (nums1[p1] < nums2[p2]) {
                nums[count]=nums1[p1];
                p1++;
            } else {
                nums[count]=nums2[p2];
                p2++;
            }
            count++;
        }
        if(count<nums.length){
            while(p1<len1){
                nums[count]=nums1[p1];
                count++;
                p1++;
            }
            while(p2<len2){
                nums[count]=nums2[p2];
                count++;
                p2++;
            }
        }
        int index=0;
        if((len1+len2)%2==0){
            index=(len1+len2)/2;
            return (nums[index-1]+(double)nums[index])/2;

        }
        else{
            index=(len1+len2)/2;
            return nums[index];
        }

    }
}
