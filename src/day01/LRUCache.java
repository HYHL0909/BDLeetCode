package day01;

import java.util.HashMap;

 public class LRUCache{
     int count;
    int capacity;
     HashMap<Integer,DLinkedNode> cache=new HashMap<Integer, DLinkedNode>();
     DLinkedNode head,tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.count=0;
        head=new DLinkedNode();
        head.pre=null;
        tail=new DLinkedNode();
        tail.next=null;
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        DLinkedNode node=cache.get(key);
        if(node==null)
            return -1;
        moveToTail(node);
        return node.var;
    }

    private void moveToTail(DLinkedNode node) {
        removeNode(node);
        addToTail(node);

    }

    public void put(int key, int value) {
        DLinkedNode node=cache.get(key);

        if(node==null){
            //添加
            DLinkedNode new_node=new DLinkedNode(key,value);
            cache.put(key,new_node);
            addToTail(new_node);
            count++;
//            System.out.println("count"+count);
//            System.out.println("c"+capacity);


            if(count<=capacity)
            {
            }
            else{
//                System.out.println("count>2");
                //删除最旧未使用的，就是头部；
                DLinkedNode old_node=popHead();
                count--;
                this.cache.remove(old_node.key);
            }
        }
        else{
            //更新,移动到尾部
            node.var=value;
            moveToTail(node);

        }


    }

    private DLinkedNode popHead() {
        //注意，这里如果调用了pophead，则说明是需要弹出的，必然不可能为空
        DLinkedNode node=head.next;
        removeNode(node);
        return node;
    }

    private void removeNode(DLinkedNode node) {
        DLinkedNode pre=node.pre;
        DLinkedNode next=node.next;
        pre.next=next;
        next.pre=pre;

    }

    private void addToTail(DLinkedNode node) {
        tail.pre.next=node;
      node.pre=tail.pre;
      node.next=tail;
      tail.pre=node;
    }
//    public void print(){
//        DLinkedNode p=head;
//        while(p!=null){
//            System.out.print(p.var+";");
//            p=p.next;
//        }
//        System.out.println();
//    }
}
class DLinkedNode{
    int var;
    int key;
   DLinkedNode pre;
   DLinkedNode next;
   DLinkedNode(){}
   DLinkedNode(int key,int value){
       this.var=value;
       this.key=key;
   }

}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

