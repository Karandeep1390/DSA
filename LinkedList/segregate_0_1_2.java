package LinkedList;

public class segregate_0_1_2 {
    static ListNode segregate(ListNode head){
        // add your code here
        ListNode zero = new ListNode(-1);
        ListNode one = new ListNode(-1);
        ListNode two = new ListNode(-1);

        ListNode pz = zero;
        ListNode po = one;
        ListNode pt = two;

        ListNode curr = head;

        while(curr != null){
            if(curr.val == 0){
                pz.next = curr;
                curr = curr.next;
                pz = pz.next;
            }else if(curr.val == 1){
                po.next = curr;
                curr = curr.next;
                po = po.next;
            }else{
                pt.next = curr;
                curr = curr.next;
                pt = pt.next;
            }
        }

        pz.next = one.next;
        po.next = two.next;

        return zero.next;
    }
}
