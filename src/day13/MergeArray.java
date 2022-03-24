package day13;

import java.util.Arrays;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n+m==n){
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }

        int l1=0;
        int l2=0;
        int[] temp=new int[m+n];
        int index=0;
        while(l1<m&&l2<n){
            if(nums1[l1]>nums2[l2])
            {
                temp[index]=nums2[l2];
                l2++;
            }
            else{
                temp[index]=nums1[l1];
                l1++;
            }
            index++;
        }
        if(index!=m+n){
            if(l1==m){
                while(index<m+n){
                    temp[index]=nums2[l2];
                    index++;
                    l2++;
                }
            }
            else{
                while(index<m+n){
                    temp[index]=nums1[l1];
                    index++;
                    l1++;
                }
            }
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i]=temp[i];
        }

    }
}
