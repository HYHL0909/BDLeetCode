package day10;

import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        if(root==null)
            return res;
        inorder(root,res);
        return res;
    }

    private void inorder(TreeNode root,List<Integer> res) {
        if(root==null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
