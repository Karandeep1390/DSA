package LinkedList;

public class add_1_to_linkedlist {
    public static ListNode addOne(ListNode head) 
    { 
        //code here.
        ListNode h = new reverse_ll().reverseList(head);

        ListNode curr = h;
        ListNode prev = null;

        int c = 1;

        while(curr != null){
            int data = curr.val + c;
            curr.val = data%10;
            c = data/10;
            prev = curr;
            curr = curr.next;
        }

        if(c != 0){
            prev.next = new ListNode(c);
        }

        return new reverse_ll().reverseList(h);

    }
}
