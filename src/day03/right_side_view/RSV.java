package day03.right_side_view;

import java.util.LinkedList;
import java.util.List;

public class RSV {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        int level=0;
        rightDFS(root,res,level);
        return res;
    }

    private void rightDFS(TreeNode root, List<Integer> res,int level) {
        if(root==null)
            return;
        if(res.size()==level)
            res.add(root.val);
        rightDFS(root.right, res, level+1);
        rightDFS(root.left ,res,level+1);
    }

}
