class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode pro=head;
        ListNode noob=head;
        while(pro.next!=null)
        {
            if(pro.next.next!=null)
            pro=pro.next.next;
            else
                pro=pro.next;
            noob=noob.next;
        }
        return noob;
        
    }
}
