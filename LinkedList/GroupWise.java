// 62. Group Wise
public class GroupWise {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null)
            return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        int count = 0;

        // Reverse first k nodes
        while (curr != null && count < k) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            count++;
        }

        // Reverse remaining list recursively
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }
}