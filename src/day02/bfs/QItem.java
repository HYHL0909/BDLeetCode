package day02.bfs;

public class QItem {
    int depth;
    TreeNode node;

    public QItem() {
    }

    public QItem(int depth, TreeNode node) {
        this.depth = depth;
        this.node = node;
    }
}
