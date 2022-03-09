package day02.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinLenBFS {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        QItem qItem=new QItem(1,root);
        Queue<QItem> queue=new LinkedList<>();
        queue.offer(qItem);
        while(!queue.isEmpty()){
            QItem qItem1=queue.poll();
            TreeNode node=qItem1.node;
            int depth=qItem1.depth;
            if(node.left==null&&node.right==null)
                return depth;
            if(node.left!=null){
                QItem newQ=new QItem(depth+1,node.left);
                queue.offer(newQ);
            }
            if(node.right!=null){
                QItem newQ=new QItem(depth+1,node.right);
                queue.offer(newQ);
            }
        }
        return 0;

    }
}



