package day15;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequtive {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int y=num;
                while(set.contains(y+1)) y++;
                res=Math.max(res,y-num+1);
            }
        }
        return res;

    }
}
