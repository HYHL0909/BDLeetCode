package day16;

import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class SumNumber {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    private int dfs(TreeNode root, int res) {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return res*10+root.val;
        res= res*10+root.val;
        return dfs(root.left,res)+dfs(root.right,res);
    }
//
//    public static int ans=0;
//    public int sumNumbers(TreeNode root) {
//        dfs(root,0);
//        return ans;
//    }
//
//    private void dfs(TreeNode root, int res) {
//        if(root.left==null&&root.right==null){
//            res=res*10+root.val;
//            ans+=res;
//            return;
//        }
//        res=res*10+root.val;
//        if(root.right!=null)
//            dfs(root.right,res);
//        dfs(root.left,res);
//    }
}
