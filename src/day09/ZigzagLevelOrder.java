package day09;

import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
    List<List<Integer>> res=new LinkedList<List<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return res;
        levelOrder(root,0);
        return res;
    }

    private void levelOrder(TreeNode root, int level) {
        if(level==res.size()){
            List<Integer> newl=new LinkedList<Integer>();
            newl.add(root.val);
            res.add(newl);

        }else{
            if(level%2==0){
                res.get(level).add(root.val);

            }else{
                res.get(level).add(0,root.val);

            }
        }
        if(root.left!=null)
            levelOrder(root.left,level+1);
        if(root.right!=null)
            levelOrder(root.right,level+1);
    }
}
