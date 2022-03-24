package day10;

import java.util.Stack;

class DecodeString {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack stack_multi=new Stack();
        Stack stack_res=new Stack();
        for(Character c : s.toCharArray()) {
            if(c == '[') {
                stack_multi.push(multi);
                stack_res.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            }
            else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = (int)stack_multi.pop();
                for(int i = 0; i < cur_multi; i++) tmp.append(res);
                res = new StringBuilder((String)stack_res.pop()+ tmp);
            }
            else if(c >= '0' && c <= '9') multi = multi * 10 + (c-'0');
            else res.append(c);
        }
        return res.toString();
    }

}


