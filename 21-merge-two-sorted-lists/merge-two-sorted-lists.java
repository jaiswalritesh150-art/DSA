/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> values = new ArrayList<>();
        while (l1 != null) {
            values.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            values.add(l2.val);
            l2 = l2.next;
        }

        
        Collections.sort(values);
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }

        return dummy.next;
    }
}
