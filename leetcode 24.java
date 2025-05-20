//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        // A=HEAD,B=HEAD.NEXT,C=HEAD.NEXT.NEXT
       ListNode temp=head.next;
        head.next=swapPairs(head.next.next);
    temp.next=head;
        return temp;
    }
}
