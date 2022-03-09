package day01;
// 答题思路：
//  定义一个新的链表
//  在旧链表的起始结点放置p、q两个pointer
//  比较p、q，谁小谁就插入新链表，然后向后移动。
// 特殊情况，两个都是空：直接返回其中一个，两个有一个为空，返回不为空的
public class MergeTowList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p=new ListNode();
        ListNode q=p;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                q.next=list1;
                list1=list1.next;
            }
            else{
                q.next=list2;
                list2=list2.next;

            }
            q=q.next;
        }
        q.next=(list1==null?list2:list1);

        return p.next;
    }




}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

