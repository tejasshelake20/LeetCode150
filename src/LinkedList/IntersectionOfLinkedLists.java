package LinkedList;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        // Create the intersecting part of the linked lists
        ListNode2 intersectingNode = new ListNode2(8);
        intersectingNode.next = new ListNode2(10);

        // Create the first linked list: 4 -> 1 -> 8 -> 10
        ListNode2 headA = new ListNode2(4);
        headA.next = new ListNode2(1);
        headA.next.next = intersectingNode;

        // Create the second linked list: 5 -> 6 -> 1 -> 8 -> 10
        ListNode2 headB = new ListNode2(5);
        headB.next = new ListNode2(6);
        headB.next.next = new ListNode2(1);
        headB.next.next.next = intersectingNode;

        IntersectionOfLinkedLists main = new IntersectionOfLinkedLists();
        ListNode2 intersection = main.getIntersectionNode(headA, headB);

        // Print the value of the intersection node
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }

    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        ListNode2 ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) { // loop until we found the first common node
            ptrA = (ptrA == null) ? headB : ptrA.next; // once we're done with A, move to B
            ptrB = (ptrB == null) ? headA : ptrB.next; // once we're done with B, move to A
        }
        return ptrA;
    }
}
