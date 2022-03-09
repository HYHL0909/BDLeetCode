package day02;

public class LongestSubWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        String test="";
        int len=0;
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String temp=String.valueOf(chars[i]);
            if(test.contains(temp)){
                test=test.substring(test.indexOf(temp)+1);
            }
            test+=temp;
            len=Math.max(len,test.length());
        }
        return len;

    }

}
