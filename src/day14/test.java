package day14;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        Merge m=new Merge();
        int[][] intervals={{1,3},{2,6}};
        int[][] ans=m.merge(intervals);
        for(int i=0;i<ans.length;i++){
            Arrays.toString(ans[0]);
        }
    }
}
