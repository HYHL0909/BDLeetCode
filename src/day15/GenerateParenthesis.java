package day15;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<>();
        dfs("",n,n,res);

        return res;
    }

    private void dfs(String s, int l, int r, List<String> res) {
        if(l==0&&r==0){
            res.add(s);
        }
        if(l!=0){
            dfs(s+"(",l-1,r,res);
        }
        if(r!=0&&l<r)
            dfs(s+")",l,r-1,res);
    }
}
