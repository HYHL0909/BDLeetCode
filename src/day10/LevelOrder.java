package day10;

import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(root==null)
            return res;
        level(res,root,0);
        return res;
    }

    private void level(List<List<Integer>> res, TreeNode root,int level) {
        if(level==res.size()){
            List<Integer> list=new LinkedList<>();
            list.add(root.val);
            res.add(list);
        }
        else{
            res.get(level).add(root.val);
        }
        if(root.left!=null){
            level(res,root.left,level+1);
        }
        if(root.right!=null)
            level(res, root.right, level+1);

    }
}
