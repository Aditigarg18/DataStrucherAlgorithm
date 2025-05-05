//leetcode 206
// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
class Solution {
    public ListNode reverseList(ListNode head) {
//         ListNode temp=head;
//         ListNode prev=null;
//         while(temp!=null){
//            ListNode front=temp.next;
//             temp.next=prev;
//             prev=temp;
//             temp=front;
//         }
//         return prev;
//     }
// }

if(head==null || head.next==null){
    return head;
}
ListNode newhead=reverseList(head.next);
ListNode front=head.next;
front.next=head;
head.next=null;
return newhead;
    }
}
