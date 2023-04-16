package LinkedList;

public class Count_Node_in_Loop {
    static int countNodesinLoop(ListNode head)
    {
        //Add your code here.
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        if(fast == null || fast.next == null) return 0;

        int count = 0;

        ListNode prev = slow;
        slow = slow.next;

        while(prev != slow){
            slow = slow.next;
            count++;
        }

        return count+1;
    }
}
