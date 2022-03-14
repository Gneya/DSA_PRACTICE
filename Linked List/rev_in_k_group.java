/****************************************************************
    Following is the Linked List node structure

    class Node
    {
    public:
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = NULL;
        }
    };

public class Solution {

	public static Node kReverse(Node head, int k) {
		// write your code here
		  if(head==null)
        {
            return null;
        }
        
        Node curr=head;
        Node prev=null;
        Node f=null;
        int count=0;
        
        while(curr!=null && count<k)
        {
            f=curr.next;
            curr.next=prev;
            prev=curr;
            curr=f;
            count++;
        }
        
        if(f!=null)
        {
            head.next=kReverse(f,k);
        }
        return prev;
	}
}
