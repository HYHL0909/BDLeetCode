package day02.bfs;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null&&targetSum==0)
            return true;
        boolean ans=false;
        int subsum=targetSum-root.val;
        if(subsum==0&&root.left==null&&root.right==null){
            ans=true;
            return ans;
        }
        if(root.right!=null){
            ans=ans||hasPathSum(root.right,subsum);
        }
        if(root.left!=null){
//            要有ans或是两条路只要有一条可以走就能够
            ans=ans||hasPathSum(root.left,subsum);
        }
        return ans;

    }
}
