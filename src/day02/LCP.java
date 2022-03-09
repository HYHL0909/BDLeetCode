package day02;
/*The longest common prefix for an array of strings is the
common prefix between 2 most dissimilar strings.:字典序越靠近则字符串越相似
Arrays.sort()利用的就是字典序
For example,
 in the given array {“apple”, “ape”, “zebra”}, there is no
  common prefix because the 2 most dissimilar strings of the
  array “ape” and “zebra” do not share any starting characters. */

import java.util.Arrays;

public class LCP {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        Arrays.sort(strs);
        return lcp(strs[0],strs[1]);
    }

    private String lcp(String str, String str1) {
        int len=(str.length()<str1.length()?str.length():str1.length());
        String res="";
        for (int i = 0; i <len ; i++) {
            if(str.charAt(i)!=str1.charAt(i))
            {
                break;
            }
            res+=str.charAt(i);
        }
        return res;
    }
}
