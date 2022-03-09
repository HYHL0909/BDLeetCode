package day01;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
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

