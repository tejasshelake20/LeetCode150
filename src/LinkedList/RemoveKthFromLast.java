package LinkedList;

class ListNode {
    int val;
    ListNode2 next;
    ListNode(int x) { val = x; }
}

public class RemoveKthFromLast {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);

        int n = 2; // Remove the 2nd node from the end

        RemoveKthFromLast main = new RemoveKthFromLast();
        head = main.removeNthFromEnd(head, n);

        // Print the modified linked list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public ListNode2 removeNthFromEnd(ListNode2 head, int n) {
        int size = 1;
        ListNode2 temp = head;
        ListNode2 slow = head;
        if (temp.next == null) {
            temp = null;
            return temp;
        }
        while (temp != null && temp.next != null) {
            size++;
            temp = temp.next;
        }

        int sol = 0;

        while (slow.next != null) {
            sol++;

            if (n == 1 && sol == size - n) {
                slow.next = null;
                return head;
            }
            if (size - n == 0) {
                slow = slow.next;
                return slow;
            }
            if (sol == size - n && slow.next.next != null) {
                slow.next = slow.next.next;
                return head;
            }

            slow = slow.next;
        }
        return head;
    }
}
