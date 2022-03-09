package day02.binary_tree_path;

public class MaxPathSum {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        maxSingle(root);
        return res;
    }

    private int  maxSingle(TreeNode root) {
        if(root==null)
            return 0;

        //左右子树是负数就抛弃
        int left=Math.max(0,maxSingle(root.left));
        int right=Math.max(0,maxSingle(root.right));
//        返回值返回的是3种情况
        int max_single=Math.max(left,right)+root.val;

        //本节点为复数的要保留。
        res=Math.max(res,left+right+ root.val);
        return max_single;
    }




}
