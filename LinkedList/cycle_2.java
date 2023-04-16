package LinkedList;

public class cycle_2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) break;
        }

        if(fast == null || fast.next == null){
            return null;
        }

        while(slow != head){
            slow = slow.next;
            head = head.next;
        }

        return head;
    }
}
