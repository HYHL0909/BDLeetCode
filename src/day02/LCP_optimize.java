package day02;

public class LCP_optimize {
    public String longestCommonPrefix(String[] strs) {
        int min_len=getMinLen(strs);
        char cur;
        String res="";
        for (int i = 0; i < min_len; i++) {
            cur=strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i)!=cur)
                {
                    return res;
                }
            }
            res+=cur;
        }
        return res;

    }

    private int getMinLen(String[] strs) {
        int min_len=strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length()<min_len)
                min_len=strs[i].length();

        }
        return min_len;

    }

    private String lcp(String str, String str1) {
        int len=(Math.min(str.length(), str1.length()));
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
