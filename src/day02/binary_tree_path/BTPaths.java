package day02.binary_tree_path;

import java.util.LinkedList;
import java.util.List;

public class BTPaths {
    /*
    * 给了root，到达叶子的时候则将该条路径存入*/
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return null;

        List<String > list=new LinkedList<>();
        String path="";
        return func(root,list,path);
    }

    private List<String> func(TreeNode root, List<String> list, String path) {
        path=path+root.val;
        if(root.left==null&&root.right==null)
            list.add(path);
        else {
            path += "->";
            if (root.left != null) {
                func(root.left, list, path);
            }
            if(root.right!=null){
                func(root.right, list, path);
            }
        }
        return list;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
