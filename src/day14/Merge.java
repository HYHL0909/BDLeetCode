package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> lis=new ArrayList<int[]>();
        lis.add(intervals[0]);
        System.out.println(lis.size());
        for (int i = 1; i < intervals.length; i++) {
            int[] pre=lis.get(lis.size()-1);
            int pre_r=pre[1];
            int[] cur=intervals[i];
            int cur_l=cur[0];
            int cur_r=cur[1];
            if (cur_l>pre_r){
                lis.add(cur);
            }
            else{
                pre_r=Math.max(cur_r,pre_r);
                pre[1]=pre_r;
            }
        }
        return lis.toArray(new int[lis.size()][2]);
    }
}
