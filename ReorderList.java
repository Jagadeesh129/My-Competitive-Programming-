/*
Hard
Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to: A0→An-1→A1→An-2→A2→An-3→...
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: It is recommended do this in-place without altering the node's values.

Input:
LinkedList: 1->2->3
Output: 1 3 2
Explanation:
Here n=3, so the correct
order is A0→A2→A1

Input:
Explanation: 1->7->3->4
Output: 1 4 7 3
Explanation:
Here n=4, so the correct
order is A0→A3→A1→A2
*/

class Solution {
    Node reorderlist(Node head) {
        if(head.next==null || head.next.next==null || head==null){
            return head;
        }
        Node s=head,f=head,pr=null;
        while(f!=null && f.next!=null){
            pr=s;
            s=s.next;
            f=f.next.next;
        }
        pr.next=null;
        Node temp=s;
        Node curr=temp;
        Node prev=null;
        while(curr!=null){
            Node nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        Node sthead=head;
        Node revhead=prev;
        while(sthead!=null){
            Node stheadnext=sthead.next;
            Node revheadnext=revhead.next;
            sthead.next=revhead;
            if(stheadnext!=null){
                revhead.next=stheadnext;
            }
            sthead=stheadnext;
            revhead=revheadnext;
        }
        return head;
    }
}
