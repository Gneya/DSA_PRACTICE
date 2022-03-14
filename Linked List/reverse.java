class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode f=curr;
        ListNode prev=null;
        while(curr!=null)
        {
            f=curr.next;
            curr.next=prev;
            prev=curr;
            curr=f;
        }
        head=prev;
        return head;
    }
}
