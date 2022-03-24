package day08;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        char first=s.charAt(0);
        if(first==']'||first=='}'||first==')')
           return false;
        Stack stack=new Stack();
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(temp=='['||temp=='{'||temp=='('){
                stack.push(temp);
            }
            else{
                if(stack.isEmpty()||!isMatch((char)(stack.peek()),s.charAt(i)))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    private boolean isMatch(char peek, char charAt) {
        return (peek=='('&&charAt==')')||
                (peek=='{'&&charAt=='}')||(peek=='['&&charAt==']');

    }
}
