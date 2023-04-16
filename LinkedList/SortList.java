package LinkedList;

public class SortList {
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1,l2);
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode l = new ListNode(0),p = l;

        ListNode c1 = l1;
        ListNode c2 = l2;

        while(c1 != null && c2 != null){
            if(c1.val > c2.val){
                p.next = c1;
                c1 = c1.next;
                p= p.next;
            }else{
                p.next = c2;
                c2 = c2.next;
                p= p.next;
            }
        }

        if(c1 != null){
            p.next = c1;
        }

        if(c2 != null){
            p.next = c2;
        }
        
        return l.next;
    }
}
