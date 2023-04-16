package LinkedList;

public class Intersection_of_LinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != currB){
            currA = currA == null ? headB : currA.next;
            currB = currB == null ? headA : currB.next;
        }

        return currA;
    }
}
