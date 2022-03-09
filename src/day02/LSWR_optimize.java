package day02;

import java.util.HashMap;

public class LSWR_optimize {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int len=Integer.MAX_VALUE;
        HashMap<Character,Integer> window=new HashMap<Character, Integer>();

        while(right<s.length()){
            char temp=s.charAt(right);
            int a=1;
            if(window.containsKey(temp)){
                a= window.get(temp);
                a++;
            }
            window.put(temp,a);
            right++;

            while(window.get(temp)>1){
                char tem1=s.charAt(left);
                int b= window.get(tem1);
                if(b==1){
                    window.remove(tem1,b);
                }
                else{
                    b--;
                    window.put(tem1,b);
                }
                left++;
            }
            len=Math.max(window.size(), len);

        }
        return len;

    }
}
