/**
 * Created by developerZ on 10/25/16.
 */
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
//3 ways of writing Reverse LinkedList. Summerised from internet.

public class ReverseLinkedList {
    //1st, set 1 temp node, 1 pointer.
    public ListNode reverse1(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    //2nd set 2 two pointers,
    public ListNode reverse2(ListNode head){
        if(head == null)
            return head;

        ListNode prev = head;
        ListNode cur = pre.next;
        while(cur != null){
            prev.next = cur.next;
            cur.next = head;
            head = cur;
            cur = prev.next;
        }
        return head;
    }
    //3rd set 3 pointers
    public ListNode reverse3(ListNode head){
        ListNode cur= head;
        ListNode prev = null;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

}
