// Last updated: 11/08/2026, 14:20:56
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify handling
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        // Attach remaining nodes
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;
        
        return dummy.next;
    }
}
