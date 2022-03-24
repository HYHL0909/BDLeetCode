package day09;

import java.util.HashMap;

public class BuildTree {
    HashMap<Integer,Integer> inorder_table=new HashMap<>();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        int len=preorder.length;
        for (int i = 0; i < len; i++) {
            inorder_table.put(inorder[i],i);
        }
        return buildSubtree(preorder,inorder,0,len-1,0,len-1);
    }

    private TreeNode buildSubtree(int[] preorder, int[] inorder, int lp, int rp, int li, int ri) {
        if(lp>rp){
            return null;
        }
        int root_val=preorder[lp];
        TreeNode root=new TreeNode(preorder[lp]);
        int index=inorder_table.get(root_val);
        int size=index-li;
        root.left=buildSubtree(preorder,inorder,lp+1,lp+size,li,index-1);
        root.right=buildSubtree(preorder,inorder,lp+size+1,rp,index+1,ri);
        return root;
    }
}
