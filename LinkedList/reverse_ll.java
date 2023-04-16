package LinkedList;

public class reverse_ll {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        return prev;
    }

    public ListNode reverseList_(ListNode head) {
       if(head == null || head.next == null){
        return head;
       }

       ListNode nnode = reverseList_(head.next);
       head.next.next = head;

       head.next = null;

       return nnode;
    }
}
