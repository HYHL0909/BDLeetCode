package day01;

import java.util.List;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode=new ListNode();
        dummyNode.next=head;
        ListNode pre=dummyNode;

        while(head!=null){
            ListNode tail=pre;
            for(int i=0;i<k;i++){
                tail=tail.next;
                if(tail==null)
                    return dummyNode.next;
            }
            ListNode next=tail.next;
            ListNode[] listNodes=reverseList(head,tail);
            head=listNodes[1];
            tail=listNodes[0];
            pre.next=head;
            tail.next=next;
            pre=tail;
            head=tail.next;
        }
        return dummyNode.next;
    }
    public ListNode[] reverseList(ListNode head,ListNode tail){
        ListNode pre=null;
        ListNode cur=head;
        while (pre!=tail){
            //pre!=tail  ==  cur!=null
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return new ListNode[]{head, tail};
    }
}
